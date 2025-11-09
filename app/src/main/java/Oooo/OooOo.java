package Oooo;

import Oooo000.OooO0OO;
import OoooOoo.oOO0O0O;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.o0OOO0;
import o000OO.o0OoOo0;

/* loaded from: classes2.dex */
public final class OooOo extends o0OOO0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f13707OooO0O0;

    @Override // com.google.android.gms.internal.measurement.o0OOO0
    public OooO0OO OooO0OO(Context context, Looper looper, o0OoOo0 o0oooo0, Object obj, Oooo000.OooOO0O oooOO0O, Oooo000.OooOOO0 oooOOO0) {
        switch (this.f13707OooO0O0) {
            case 2:
                o0oooo0.getClass();
                Integer num = (Integer) o0oooo0.f30184OooOo;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new oOO0O0O(context, looper, o0oooo0, bundle, oooOO0O, oooOOO0);
            case 3:
                throw OooO00o.OooO0o0(obj);
            default:
                return super.OooO0OO(context, looper, o0oooo0, obj, oooOO0O, oooOOO0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0OOO0
    public OooO0OO OooO0Oo(Context context, Looper looper, o0OoOo0 o0oooo0, Object obj, com.google.android.gms.common.api.internal.Oooo0 oooo0, com.google.android.gms.common.api.internal.Oooo0 oooo02) {
        switch (this.f13707OooO0O0) {
            case 0:
                return new OooOO0O(context, looper, 300, o0oooo0, oooo0, oooo02);
            case 1:
                return new Oooo0.OooO0OO(context, looper, o0oooo0, (Oooo00O.o0OoOo0) obj, oooo0, oooo02);
            default:
                return super.OooO0Oo(context, looper, o0oooo0, obj, oooo0, oooo02);
        }
    }
}
