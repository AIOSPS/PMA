package eu.pms.common.utils;

/**
 * <p>Title: </p>
 * <p>Description: To initialize the chart to be ready for charting data</p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: Al-Quds Open University</p>
 * @author Mustafa Al-Tamim
 * @version 1.0
 */



public class ChartInitializer
{
    public ChartInitializer()
    {
    }
/*
    public static DatasetProducer initiallizeChart()
    {
        DatasetProducer ganttData = new DatasetProducer()
        {
            final private long now = System.currentTimeMillis();
            final private long day = 1000 * 60 * 60 * 24;
            final private String[] workflows =
                    {"Analysis", "Design", "Implementation", "Test", "Rollout",
                    "Operations"};
            final private String[] person =
                    {"Frank", "Paul", "Daisy", "Chris"};
            public Object produceDataset(Map params)
            {
                TaskSeriesCollection ds = new TaskSeriesCollection();
                for(int j = 0; j < 4; j++)
                {
                    TaskSeries ser = new TaskSeries(person[j]);
                    long lastEnd = now + getRandomTime();
                    for(int i = 0; i < workflows.length; i++)
                    {
                        long myEnd = lastEnd + getRandomTime();
                        Task t = new Task(workflows[i],
                                          new SimpleTimePeriod(new Date(lastEnd),
                                new Date(myEnd)));
                        ser.add(t);
                        lastEnd = myEnd;
                    }
                    ds.add(ser);
                }
                return ds;
            }

            private long getRandomTime()
            {
                return day * (long) (Math.random() * 31 + 15);
            }

            public String getProducerId()
            {
                return "GanttDataProducer";
            }

            public boolean hasExpired(Map params, Date since)
            {
                return true;
            }
        };
        return ganttData;
    }*/
}