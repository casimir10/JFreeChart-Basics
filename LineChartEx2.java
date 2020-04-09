package graphs;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
public class LineChartEx2 extends JFrame{
	 public LineChartEx2() {

	        initUI();
	    }

	    private void initUI() {

	        XYDataset dataset = createDataset();
	        JFreeChart chart = createChart(dataset);
	        ChartPanel chartPanel = new ChartPanel(chart);
	        chartPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	        chartPanel.setBackground(Color.white);
	        
	        add(chartPanel);

	        pack();
	        setTitle("Line chart");
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

	    private XYDataset createDataset() {

	        var series1 = new XYSeries("Drama");
	        series1.add(1990, 0);
	        series1.add(1991, 0);
	        series1.add(1992, 5);
	        series1.add(1993, 29);
	        series1.add(1994, 52);
	        series1.add(1995, 46);
	        series1.add(1996, 2);

	        var series2 = new XYSeries("Comedy");
	        series2.add(1990, 1);
	        series2.add(1991, 0);
	        series2.add(1992, 0);
	        series2.add(1993, 6);
	        series2.add(1994, 27);
	        series2.add(1995, 25);
	        series2.add(1996, 11);
	        
	        var series3 = new XYSeries("Romance");
	        series3.add(1990, 1);
	        series3.add(1991, 0);
	        series3.add(1992, 4);
	        series3.add(1993, 16);
	        series3.add(1994, 26);
	        series3.add(1995, 39);
	        series3.add(1996, 9);
	        
	        var series4 = new XYSeries("Thriller");
	        series4.add(1990, 1);
	        series4.add(1991, 1);
	        series4.add(1992, 1);
	        series4.add(1993, 20);
	        series4.add(1994, 30);
	        series4.add(1995, 34);
	        series4.add(1996, 11);
	        
	        var series5 = new XYSeries("Western");
	        series5.add(1990, 1);
	        series5.add(1991, 0);
	        series5.add(1992, 0);
	        series5.add(1993, 2);
	        series5.add(1994, 6);
	        series5.add(1995, 3);
	        series5.add(1996, 0);
	        
	        var series6 = new XYSeries("Crime");
	        series6.add(1990, 0);
	        series6.add(1991, 0);
	        series6.add(1992, 0);
	        series6.add(1993, 2);
	        series6.add(1994, 1);
	        series6.add(1995, 2);
	        series6.add(1996, 1);
	        
	        var series7 = new XYSeries("Fantasy");
	        series7.add(1990, 0);
	        series7.add(1991, 0);
	        series7.add(1992, 0);
	        series7.add(1993, 2);
	        series7.add(1994, 7);
	        series7.add(1995, 7);
	        series7.add(1996, 0);
	        
	        var series8 = new XYSeries("IMAX");
	        series8.add(1990, 0);
	        series8.add(1991, 1);
	        series8.add(1992, 0);
	        series8.add(1993, 0);
	        series8.add(1994, 1);
	        series8.add(1995, 1);
	        series8.add(1996, 0);
	        
	        var series9 = new XYSeries("War");
	        series9.add(1990, 0);
	        series9.add(1991, 0);
	        series9.add(1992, 0);
	        series9.add(1993, 2);
	        series9.add(1994, 5);
	        series9.add(1995, 8);
	        series9.add(1996, 0);
	        
	        var series10 = new XYSeries("Musical");
	        series10.add(1990, 0);
	        series10.add(1991, 0);
	        series10.add(1992, 1);
	        series10.add(1993, 4);
	        series10.add(1994, 1);
	        series10.add(1995, 0);
	        series10.add(1996, 1);
	        
	        var series11 = new XYSeries("Children");
	        series11.add(1990, 0);
	        series11.add(1991, 0);
	        series11.add(1992, 0);
	        series11.add(1993, 0);
	        series11.add(1994, 2);
	        series11.add(1995, 7);
	        series11.add(1996, 1);
	        
	        var series12 = new XYSeries("Sci-Fi");
	        series12.add(1990, 0);
	        series12.add(1991, 1);
	        series12.add(1992, 0);
	        series12.add(1993, 3);
	        series12.add(1994, 6);
	        series12.add(1995, 8);
	        series12.add(1996, 1);
	        
	        var series13 = new XYSeries("Action");
	        series13.add(1990, 0);
	        series13.add(1991, 0);
	        series13.add(1992, 0);
	        series13.add(1993, 0);
	        series13.add(1994, 0);
	        series13.add(1995, 4);
	        series13.add(1996, 0);
	        
	        var series14 = new XYSeries("Documentary");
	        series14.add(1990, 0);
	        series14.add(1991, 0);
	        series14.add(1992, 0);
	        series14.add(1993, 2);
	        series14.add(1994, 4);
	        series14.add(1995, 6);
	        series14.add(1996, 1);
	        
	        var series15 = new XYSeries("Horror");
	        series15.add(1990, 0);
	        series15.add(1991, 0);
	        series15.add(1992, 0);
	        series15.add(1993, 1);
	        series15.add(1994, 2);
	        series15.add(1995, 6);
	        series15.add(1996, 0);
	        
	        var series16 = new XYSeries("Mystery");
	        series16.add(1990, 0);
	        series16.add(1991, 0);
	        series16.add(1992, 0);
	        series16.add(1993, 2);
	        series16.add(1994, 2);
	        series16.add(1995, 3);
	        series16.add(1996, 1);

	        var dataset = new XYSeriesCollection();
	        dataset.addSeries(series1);
	        dataset.addSeries(series2);
	        dataset.addSeries(series3);
	        dataset.addSeries(series4);
	        dataset.addSeries(series5);
	        dataset.addSeries(series6);
	        dataset.addSeries(series7);
	        dataset.addSeries(series8);
	        dataset.addSeries(series9);
	        dataset.addSeries(series10);
	        dataset.addSeries(series11);
	        dataset.addSeries(series12);
	        dataset.addSeries(series13);
	        dataset.addSeries(series14);
	        dataset.addSeries(series15);
	        dataset.addSeries(series16);
	        

	        return dataset;
	    }

	    private JFreeChart createChart(final XYDataset dataset) {

	        JFreeChart chart = ChartFactory.createXYLineChart(
	                "Popularity of Movie Genres",
	                "Year",
	                "Releases",
	                dataset,
	                PlotOrientation.VERTICAL,
	                true,
	                true,
	                false
	        );

	        
	        XYPlot plot = chart.getXYPlot();

	        var renderer = new XYLineAndShapeRenderer();

	        renderer.setSeriesPaint(0, Color.RED);
	        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(1, Color.BLUE);
	        renderer.setSeriesStroke(1, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(2, Color.BLACK);
	        renderer.setSeriesStroke(2, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(3, Color.CYAN);
	        renderer.setSeriesStroke(3, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(4, Color.DARK_GRAY);
	        renderer.setSeriesStroke(4, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(5, Color.GRAY);
	        renderer.setSeriesStroke(5, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(6, Color.GREEN);
	        renderer.setSeriesStroke(6, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(7, Color.LIGHT_GRAY);
	        renderer.setSeriesStroke(7, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(8, Color.MAGENTA);
	        renderer.setSeriesStroke(8, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(9, Color.ORANGE);
	        renderer.setSeriesStroke(9, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(10, Color.PINK);
	        renderer.setSeriesStroke(10, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(11, Color.YELLOW);
	        renderer.setSeriesStroke(11, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(12, Color.getHSBColor(0, 96, 100));
	        renderer.setSeriesStroke(12, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(13, Color.getHSBColor(0, 160, 160));
	        renderer.setSeriesStroke(13, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(14, Color.getHSBColor(240, 64, 64));
	        renderer.setSeriesStroke(14, new BasicStroke(2.0f));
	        
	        renderer.setSeriesPaint(15, Color.getHSBColor(192, 32, 154));
	        renderer.setSeriesStroke(15, new BasicStroke(2.0f));

	        plot.setRenderer(renderer);
	        plot.setBackgroundPaint(Color.white);
	        plot.setRangeGridlinesVisible(false);
	        plot.setDomainGridlinesVisible(false);

	        chart.getLegend().setFrame(BlockBorder.NONE);

	        chart.setTitle(new TextTitle("Popularity of 90s Movie Genres",
	                        new Font("Serif", Font.BOLD, 18)
	                )
	        );
	        
	        return chart;
	    }

	    public static void main(String[] args) {

	        EventQueue.invokeLater(() -> {

	            var ex = new LineChartEx2();
	            ex.setVisible(true);
	        });
	        
	        
	    }	
}
