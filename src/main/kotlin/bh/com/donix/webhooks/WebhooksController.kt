package bh.com.donix.webhooks

import bh.com.donix.extensions.logInfo
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api/v1/webhooks")
class WebhooksController {


    @PostMapping("/cvs-push")
    fun pushEvent(payload: String){
        ("Received push events ").logInfo()
        (payload).logInfo()
    }
}