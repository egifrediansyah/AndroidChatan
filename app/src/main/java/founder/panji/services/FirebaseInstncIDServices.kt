package founder.panji.myapplication.services

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.messaging.FirebaseMessaging


/**
 *   created by Irfan Assidiq on 2019-05-11
 *   email : assidiq.irfan@gmail.com
 **/
class FirebaseInstncIDServices : FirebaseInstanceIdService(){
    private val FRIENDLY_ENGAGE_TOPIC = "friendly_engage"

    override fun onTokenRefresh() {
        super.onTokenRefresh()

        val token = FirebaseInstanceId.getInstance().token

        // Once a token is generated, we subscribe to topic.
        FirebaseMessaging.getInstance().subscribeToTopic(FRIENDLY_ENGAGE_TOPIC)
    }
}