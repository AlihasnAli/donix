package bh.com.donix.pdf.model

import com.itextpdf.text.Document
import com.itextpdf.text.Element
import com.itextpdf.text.pdf.PdfWriter
import java.io.OutputStream

abstract class PdfDocument {

    fun createDocument(doc: Document, outStream: OutputStream) {
        with(doc) {
            try {
                val writer = PdfWriter.getInstance(this, outStream)
                setPdfEvents(writer)
                this.open()
                setPdfElements(writer, this)
            } finally {
                this.close()
            }
        }
    }

    abstract fun setPdfEvents(writer: PdfWriter)

    abstract fun setPdfElements(writer: PdfWriter, doc: Document)

    abstract fun setPdfPageFooter(writer: PdfWriter)

}