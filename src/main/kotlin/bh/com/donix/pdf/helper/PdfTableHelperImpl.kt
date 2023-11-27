package bh.com.donix.pdf.helper

import com.itextpdf.text.pdf.PdfPCell
import com.itextpdf.text.pdf.PdfPTable

open class PdfTableHelperImpl : PdfTableHelper {

    override fun createTable(numberOfColumns: Int): PdfPTable {
        return PdfPTable(numberOfColumns)
    }

    override fun createTable(numberOfColumns: Int, cell: PdfPCell): PdfPTable {
        return createTable(numberOfColumns).apply {
            addTableCell(this, cell)
        }
    }

    override fun createTable(numberOfColumns: Int, cells: MutableList<PdfPCell>): PdfPTable {
        return createTable(numberOfColumns).apply {
            addTableCells(this, cells)
        }
    }

    override fun createTable(numberOfColumns: Int, tableData: MutableList<MutableList<PdfPCell>>): PdfPTable {
        return createTable(numberOfColumns).apply {
            tableData.forEach { row ->
                addTableCells(this, row)
            }
        }
    }

    override fun addTableCell(table: PdfPTable, cell: PdfPCell) {
        table.addCell(cell)
    }

    override fun addTableCells(table: PdfPTable, cells: MutableList<PdfPCell>) {
        cells.forEach { cell ->
            addTableCell(table, cell)
        }
    }

    override fun emptyBorderlessTableCell(): PdfPCell {
        return PdfPCell().apply {
            border = PdfPCell.NO_BORDER
        }
    }
}
