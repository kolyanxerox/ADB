package OooOooo;

import OoooO0.OooOO0O;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.app.PendingIntentCompat;
import com.ironsource.C3037dc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class o00 extends OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f13658OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000O0 f13659OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o000O0 o000o0, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f13659OooO0O0 = o000o0;
        this.f13658OooO00o = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = o000O0Oo.f13670OooO00o;
        o000O0 o000o0 = this.f13659OooO0O0;
        Context context = this.f13658OooO00o;
        int iOooO0OO = o000o0.OooO0OO(context, i2);
        AtomicBoolean atomicBoolean = o000O.f13660OooO00o;
        if (iOooO0OO == 1 || iOooO0OO == 2 || iOooO0OO == 3 || iOooO0OO == 9) {
            Intent intentOooO0O0 = o000o0.OooO0O0(context, C3037dc.f8262q, iOooO0OO);
            o000o0.OooO0oo(context, iOooO0OO, intentOooO0O0 == null ? null : PendingIntentCompat.getActivity(context, 0, intentOooO0O0, 134217728, false));
        }
    }
}
