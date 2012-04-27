/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Jose Nobile
 */
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import static net.sf.dynamicreports.report.builder.DynamicReports.*;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.PageOrientation;
import net.sf.dynamicreports.report.constant.PageType;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.view.JasperViewer;

public class ReportFromJTable {

    JasperReportBuilder jrb;
    JasperViewer jv;
    private String title;
    JTable table;
    protected static final StyleBuilder boldStyle = stl.style().bold();
    protected static final StyleBuilder boldCenteredStyle = stl.style(boldStyle).setHorizontalAlignment(HorizontalAlignment.CENTER);
    protected static final StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle).setBorder(stl.pen1Point()).setBackgroundColor(Color.LIGHT_GRAY);

    public ReportFromJTable(JTable tableA, String title) {
        this.title = title;
        this.table = tableA;
        build();
    }

    private void build() {
        try {
            jrb = report();
            jrb = jrb.setPageFormat(PageType.LETTER, PageOrientation.LANDSCAPE);
            jrb = jrb.setColumnTitleStyle(columnTitleStyle);
            jrb = jrb.title(cmp.text(title));
            List<TextColumnBuilder> columnsTCB = new LinkedList<TextColumnBuilder>();

            String[] columns = new String[table.getColumnCount()];
            for (int i = 0; i < table.getColumnCount(); i++) {
                columns[i] = table.getColumnName(i);
                columnsTCB.add(col.column(columns[i], columns[i], type.stringType()).setWidth(table.getColumnModel().getColumn(i).getWidth()));
            }
            TextColumnBuilder[] ans = new TextColumnBuilder[columnsTCB.size()];
            for (int i = 0; i < columnsTCB.size(); i++) {
                ans[i] = columnsTCB.get(i);
            }
            jrb = jrb.addColumn(ans);
            DataSource dataSource = new DataSource(columns);

            for (int i = 0; i < table.getRowCount(); i++) {
                Object[] toAdd = new Object[table.getColumnCount()];
                for (int j = 0; j < table.getColumnCount(); j++) {
                    if (table.getValueAt(i, j) == null) {
                        toAdd[j] = "";
                    } else {
                        toAdd[j] = table.getValueAt(i, j).toString();
                    }
                }
                dataSource.add(toAdd);
            }
            jrb = jrb.setDataSource(dataSource);
            jrb = jrb.pageFooter(cmp.pageXofY());
            jrb = jrb.highlightDetailEvenRows();
            jv = new JasperViewer(jrb.toJasperPrint(), false);
            jv.setTitle("Reportes Taller JPA");
            /*
             * JRXlsExporter exporter = new JRXlsExporter(); File outputFile =
             * new File("C:\\test.xls"); FileOutputStream fos = null; try { fos
             * = new FileOutputStream(outputFile); } catch
             * (FileNotFoundException ex) {
             * Logger.getLogger(ParameteringReport.class.getName()).log(Level.SEVERE,
             * null, ex); }
             * exporter.setParameter(JRExporterParameter.JASPER_PRINT, jrb);
             * exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, fos);
             * //and output stream //Excel specific parameter
             * exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
             * Boolean.FALSE);
             * exporter.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
             * Boolean.TRUE);
             * exporter.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
             * Boolean.FALSE);
             */
            jv.setVisible(true);
        } catch (DRException ex) {
            Logger.getLogger(ReportFromJTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}