package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.customaudience.OooO0O0;
import androidx.privacysandbox.ads.adservices.measurement.OooO00o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class GetTopicsResponseHelper {
    public static final GetTopicsResponseHelper INSTANCE = new GetTopicsResponseHelper();

    private GetTopicsResponseHelper() {
    }

    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        OooOo.OooO0o0(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicOooOOo = OooO00o.OooOOo(it.next());
            arrayList.add(new Topic(topicOooOOo.getTaxonomyVersion(), topicOooOOo.getModelVersion(), topicOooOOo.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    @ExperimentalFeatures.Ext11OptIn
    public final GetTopicsResponse convertResponseWithEncryptedTopics$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        OooOo.OooO0o0(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicOooOOo = OooO00o.OooOOo(it.next());
            arrayList.add(new Topic(topicOooOOo.getTaxonomyVersion(), topicOooOOo.getModelVersion(), topicOooOOo.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            android.adservices.topics.EncryptedTopic encryptedTopicOooO0o = OooO0O0.OooO0o(it2.next());
            byte[] encryptedTopic = encryptedTopicOooO0o.getEncryptedTopic();
            OooOo.OooO0Oo(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicOooO0o.getKeyIdentifier();
            OooOo.OooO0Oo(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicOooO0o.getEncapsulatedKey();
            OooOo.OooO0Oo(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new EncryptedTopic(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
