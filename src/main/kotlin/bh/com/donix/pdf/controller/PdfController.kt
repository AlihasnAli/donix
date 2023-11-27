package bh.com.donix.pdf.controller

import bh.com.donix.pdf.services.PdfService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import bh.com.donix.extensions.logMainEvent

@Controller
@RequestMapping("/api/v1/pdf")
class PdfController(
    private val pdfService: PdfService
) {

    @GetMapping("/create")
    fun createPdf(){
        ("Received Request to Create PDF document").logMainEvent()
        pdfService.createPdf()
    }


}