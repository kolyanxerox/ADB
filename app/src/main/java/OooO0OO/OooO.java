package OooO0oO;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.InAppMessageResponseListener;
import com.android.billingclient.api.InAppMessageResult;
import com.google.android.gms.internal.play_billing.oOO00O;

/* loaded from: classes.dex */
public final class OooO extends ResultReceiver {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ InAppMessageResponseListener f13260OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.f13260OooOo0O = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = oOO00O.f27203OooO00o;
        this.f13260OooOo0O.onInAppMessageResponse(bundle == null ? new InAppMessageResult(0, null) : new InAppMessageResult(bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN")));
    }
}
