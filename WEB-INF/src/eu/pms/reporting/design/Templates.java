package eu.pms.reporting.design;

import eu.pms.reporting.entity.HeaderInfo;
import net.sf.dynamicreports.report.base.expression.AbstractValueFormatter;
import net.sf.dynamicreports.report.builder.HyperLinkBuilder;
import net.sf.dynamicreports.report.builder.ReportTemplateBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.component.HorizontalListBuilder;
import net.sf.dynamicreports.report.builder.component.VerticalListBuilder;
import net.sf.dynamicreports.report.builder.datatype.BigDecimalType;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.builder.tableofcontents.TableOfContentsCustomizerBuilder;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.VerticalAlignment;
import net.sf.dynamicreports.report.definition.ReportParameters;

import java.awt.*;
import java.util.Locale;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;
import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class Templates {
    public static final StyleBuilder rootStyle;
    public static final StyleBuilder boldStyle;
    public static final StyleBuilder italicStyle;
    public static final StyleBuilder boldCenteredStyle;
    public static final StyleBuilder bold12CenteredStyle;
    public static final StyleBuilder bold18CenteredStyle;
    public static final StyleBuilder bold22CenteredStyle;
    public static final StyleBuilder columnStyle;
    public static final StyleBuilder columnTitleStyle;
    public static final StyleBuilder groupStyle;
    public static final StyleBuilder subtotalStyle;
    public static final StyleBuilder cellStyle;

    public static final ReportTemplateBuilder reportTemplate;
    public static final CurrencyType currencyType;
    public static final ComponentBuilder<?, ?> dynamicReportsComponent;
    public static final ComponentBuilder<?, ?> footerComponent;

    static {


        rootStyle           = stl.style().setPadding(new Integer(2)).setFontName("Arial");
        boldStyle           = stl.style(rootStyle).bold();
        italicStyle         = stl.style(rootStyle).italic();
        boldCenteredStyle   = stl.style(boldStyle)
                .setAlignment(HorizontalAlignment.CENTER, VerticalAlignment.MIDDLE);
        bold12CenteredStyle = stl.style(boldCenteredStyle)
                .setFontSize(new Integer(12));
        bold18CenteredStyle = stl.style(boldCenteredStyle)
                .setFontSize(new Integer(18));
        bold22CenteredStyle = stl.style(boldCenteredStyle)
                .setFontSize(new Integer(22));
        columnStyle         = stl.style(rootStyle).setVerticalAlignment(VerticalAlignment.MIDDLE);
        columnTitleStyle    = stl.style(columnStyle)
                .setBorder(stl.pen1Point())
                .setHorizontalAlignment(HorizontalAlignment.CENTER)
                .setBackgroundColor(Color.LIGHT_GRAY)
                .bold();
        groupStyle          = stl.style(boldStyle)
                .setHorizontalAlignment(HorizontalAlignment.LEFT);


        subtotalStyle       = stl.style(boldStyle)
                .setTopBorder(stl.pen1Point());
        cellStyle = stl.style(rootStyle)
                .setBorder(stl.pen1Point())
                .setAlignment(HorizontalAlignment.CENTER, VerticalAlignment.MIDDLE);

        StyleBuilder crosstabGroupStyle      = stl.style(columnTitleStyle);
        StyleBuilder crosstabGroupTotalStyle = stl.style(columnTitleStyle)
                .setBackgroundColor(new Color(170, 170, 170));
        StyleBuilder crosstabGrandTotalStyle = stl.style(columnTitleStyle)
                .setBackgroundColor(new Color(140, 140, 140));
        StyleBuilder crosstabCellStyle       = stl.style(columnStyle)
                .setBorder(stl.pen1Point());

        TableOfContentsCustomizerBuilder tableOfContentsCustomizer = tableOfContentsCustomizer()
                .setHeadingStyle(0, stl.style(rootStyle).bold());


        reportTemplate = template()
                .setLocale(Locale.ENGLISH)
                .setColumnStyle(columnStyle)
                .setColumnTitleStyle(columnTitleStyle)
                .setGroupStyle(groupStyle)
                .setGroupTitleStyle(groupStyle)
                .setSubtotalStyle(subtotalStyle)
                .highlightDetailEvenRows()
                .crosstabHighlightEvenRows()
                .setCrosstabGroupStyle(crosstabGroupStyle)
                .setCrosstabGroupTotalStyle(crosstabGroupTotalStyle)
                .setCrosstabGrandTotalStyle(crosstabGrandTotalStyle)
                .setCrosstabCellStyle(crosstabCellStyle)
                .setTableOfContentsCustomizer(tableOfContentsCustomizer)
        ;

        currencyType = new CurrencyType();

        HyperLinkBuilder link = hyperLink("http://www.qou.edu");
        dynamicReportsComponent =
                cmp.horizontalList(
//		  	cmp.image(Templates.class.getResource("qoulogo.jpg")).setFixedDimension(new Integer(60), new Integer(60)),
                        cmp.verticalList(
                                cmp.text(" Al-Quds Open University ").setStyle(bold22CenteredStyle).setHorizontalAlignment(HorizontalAlignment.LEFT),
                                cmp.text("http://www.qou.edu").setStyle(italicStyle).setHyperLink(link))

                );


        footerComponent = cmp.pageXofY()
                .setStyle(
                        stl.style(boldCenteredStyle)
                                .setTopBorder(stl.pen1Point()));
    }

    /**
     * Creates custom component which is possible to add to any report band component
     */
    public static ComponentBuilder<?, ?> createTitleComponent(String label) {
        return cmp.horizontalList()
                .add(
                        dynamicReportsComponent,
                        cmp.text(label).setStyle(bold18CenteredStyle).setHorizontalAlignment(HorizontalAlignment.RIGHT))
                .newRow()
                .add(cmp.line())
                .newRow()
                .add(cmp.verticalGap(10));
    }

    public static CurrencyValueFormatter createCurrencyValueFormatter(String label) {
        return new CurrencyValueFormatter(label);
    }

    public static class CurrencyType extends BigDecimalType {
        private static final long serialVersionUID = 1L;

        @Override
        public String getPattern() {
            return "$ #,###.00";
        }
    }

    private static class CurrencyValueFormatter extends AbstractValueFormatter<String, Number> {
        private static final long serialVersionUID = 1L;

        private String label;

        public CurrencyValueFormatter(String label) {
            this.label = label;
        }

        public String format(Number value, ReportParameters reportParameters) {
            return label + currencyType.valueToString(value, reportParameters.getLocale());
        }
    }


    public static HorizontalListBuilder getQouHeader(HeaderInfo repHeaderInfo)
    {
        HorizontalListBuilder container= cmp.horizontalList();
        HorizontalListBuilder header = cmp.horizontalList();
        VerticalListBuilder leftHeaderPart = cmp.verticalList();
        VerticalListBuilder centerHeaderPart = cmp.verticalList();
        VerticalListBuilder rightHeaderPart = cmp.verticalList();
        HorizontalListBuilder details = cmp.horizontalList();

        Integer fx1=new Integer(250);
        Integer fx2=new Integer(30);

        if(repHeaderInfo.getLayoutPage().equals(PageOrientation.LANDSCAPE))
        {
            fx1=new Integer(350);
            fx2=new Integer(40);
        }



        if((repHeaderInfo.getListLeftText()==null||repHeaderInfo.getListLeftText().length==0))
            leftHeaderPart.add(cmp.text("").setFixedDimension(fx1, new Integer(90)));
        else
        {   int h=90/repHeaderInfo.getListLeftText().length;
            for(String item:repHeaderInfo.getListLeftText())
                leftHeaderPart.add(cmp.text(item).setStyle(boldCenteredStyle).setFixedDimension(fx1, new Integer(h)).setHorizontalAlignment(HorizontalAlignment.CENTER));
        }


        centerHeaderPart.add(cmp.text("جامعة القدس المفتوحة").setStyle(bold22CenteredStyle).setHorizontalAlignment(HorizontalAlignment.CENTER));
        if(repHeaderInfo.getCenterTitle() !=null&&!repHeaderInfo.getCenterTitle().equals(""))
            centerHeaderPart.add(cmp.text(repHeaderInfo.getCenterTitle()).setStyle(bold12CenteredStyle).setHorizontalAlignment(HorizontalAlignment.CENTER));

        if(repHeaderInfo.getRightTitle() !=null&&!repHeaderInfo.getRightTitle().equals("")&&repHeaderInfo.getLeftTitle() !=null&&!repHeaderInfo.getLeftTitle().equals(""))
        {
            details.add(cmp.text("").setFixedWidth(fx2))
                    .add(cmp.text(repHeaderInfo.getLeftTitle()).setStyle(boldCenteredStyle).setHorizontalAlignment(HorizontalAlignment.LEFT))
                    .add(cmp.text(repHeaderInfo.getRightTitle()).setStyle(boldCenteredStyle).setHorizontalAlignment(HorizontalAlignment.RIGHT))
                    .add(cmp.text("").setFixedWidth(fx2)) ;
        }
        else if(repHeaderInfo.getLeftTitle() !=null&&!repHeaderInfo.getLeftTitle().equals(""))
            details.add(cmp.text(repHeaderInfo.getLeftTitle()).setStyle(boldCenteredStyle).setHorizontalAlignment(HorizontalAlignment.CENTER)) ;
        else if(repHeaderInfo.getRightTitle() !=null&&!repHeaderInfo.getRightTitle().equals(""))
            details.add(cmp.text(repHeaderInfo.getRightTitle()).setStyle(boldCenteredStyle).setHorizontalAlignment(HorizontalAlignment.CENTER)) ;

        centerHeaderPart.add(details)
                .setStyle(stl.style(boldCenteredStyle).setBorder(stl.pen1Point()).setBackgroundColor(new Color(221, 219, 219)));
//           rightHeaderPart.add(cmp.image(Templates.class.getResource("qoulogo.jpg")).setFixedDimension(fx1, new Integer(90)).setHorizontalAlignment(HorizontalAlignment.CENTER));
        header.add(leftHeaderPart)
                .add(centerHeaderPart)
                .add(rightHeaderPart)
                .setStyle(stl.style(boldCenteredStyle).setBorder(stl.pen1Point()).setBackgroundColor(new Color(231,226,226)));
        container.add(header)
                .newRow()
                .add(cmp.text(" "));
//

        return container;
    }

    public static HorizontalListBuilder getReportHeader(HeaderInfo repHeaderInfo) {
        HorizontalListBuilder header = cmp.horizontalList();
        VerticalListBuilder leftHeaderPart = cmp.verticalList();
        VerticalListBuilder centerHeaderPart = cmp.verticalList();
        VerticalListBuilder rightHeaderPart = cmp.verticalList();

//        centerHeaderPart.add(cmp.text("جامعة القدس المفتوحة   ").setStyle(stl.style(bold22CenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)));
//        centerHeaderPart.add(cmp.text(repHeaderInfo.getCenterTitle()+" / "+repHeaderInfo.getLeftTitle()).setStyle(stl.style(bold18CenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)));
//        centerHeaderPart.add(cmp.text(repHeaderInfo.getRightTitle() + "").setStyle(stl.style(bold12CenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)));
        rightHeaderPart.add(cmp.image(Templates.class.getResource("logo-sm.jpg"))).setFixedDimension(new Integer(100), new Integer(80));
//        rightHeaderPart.add(cmp.text(DynamicReportDesign.userName).setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT)));
//        rightHeaderPart.add(cmp.text("طبع من خلال بوابة الخريجين").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT)));
//        leftHeaderPart.add(cmp.image(Templates.class.getResource("logo-sm.jpg"))).setFixedDimension(new Integer(100), new Integer(80));
        leftHeaderPart.add(cmp.text(DynamicReportDesign.userName).setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
        leftHeaderPart.add(cmp.text(repHeaderInfo.getCurrentDateAr() + "").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
//        leftHeaderPart.add(cmp.text(repHeaderInfo.getCenterTitle() + "").setStyle(stl.style(bold18CenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
//        leftHeaderPart.add(cmp.text(repHeaderInfo.getLeftTitle() + "").setStyle(stl.style(bold12CenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
//        leftHeaderPart.add(cmp.text(repHeaderInfo.getRightTitle() + "").setStyle(stl.style(bold12CenteredStyle).setBackgroundColor(new Color(255,255,255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));

        header.add(rightHeaderPart);
        header.add(centerHeaderPart);
        header.add(leftHeaderPart);
        return header.setStyle(stl.style(boldCenteredStyle).setBorder(stl.pen1Point()).setBackgroundColor(new Color(255, 255, 255)));
    }
    public static VerticalListBuilder getSummary(HeaderInfo repHeaderInfo) {

        HorizontalListBuilder h1 = cmp.horizontalList();
        VerticalListBuilder r1 = cmp.verticalList();
        r1.add(cmp.text("ملاحظات : ").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
        h1.add(r1);
        HorizontalListBuilder h2 = cmp.horizontalList();
        VerticalListBuilder r2 = cmp.verticalList();
        r2.add(cmp.text("1) تعريف الخريج: هو الذي انهى كافة متطلباته الجامعية واستكمل اجراءات التخرج وطبعت شهادته بفرعه.").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
        h2.add(r2);
        HorizontalListBuilder h3 = cmp.horizontalList();
        VerticalListBuilder r3 = cmp.verticalList();
        r3.add(cmp.text("2) يوجد العديد من الخريجين خلال الفصل الحالي لم يستكملو اجراءات التخرج حتى تاريخ هذا التقرير وعليه لم تظهر اعدادهم في التقرير.").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
        h3.add(r3);

        VerticalListBuilder body = cmp.verticalList();
        body.add(h1);
        body.add(h2);
        body.add(h3);
        body.add(cmp.text(" ").setStyle(stl.style(bold22CenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)));


        return body.setStyle(stl.style(boldCenteredStyle).setBorder(stl.pen1Point()).setBackgroundColor(new Color(255, 255, 255)));
    }
    public static HorizontalListBuilder getPageFooter(HeaderInfo repHeaderInfo) {
        HorizontalListBuilder header = cmp.horizontalList();
        VerticalListBuilder leftHeaderPart = cmp.verticalList();
        VerticalListBuilder rightHeaderPart = cmp.verticalList();

        rightHeaderPart.add(cmp.text("طبع من خلال النظام المحوسب الخاص  بقسم متابعة الخريجين في عمادة شؤون الطلبة").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT)));
        leftHeaderPart.add(cmp.text(repHeaderInfo.getCurrentDateAr() + "").setStyle(stl.style(boldCenteredStyle).setBackgroundColor(new Color(255, 255, 255)).setHorizontalTextAlignment(HorizontalTextAlignment.LEFT)));

        header.add(leftHeaderPart);
        header.add(rightHeaderPart);


        return header.setStyle(stl.style(boldCenteredStyle).setBorder(stl.pen1Point()).setBackgroundColor(new Color(255, 255, 255)));
    }
}
