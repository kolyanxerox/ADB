package OoooOOO;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.o000OOo;
import com.google.android.gms.internal.measurement.o0O0O00;
import com.google.android.gms.internal.measurement.oo0o0Oo;
import java.util.Objects;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public final class o0OO000 implements ServiceConnection {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f14481OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO000o f14482OooOo0o;

    public o0OO000(o0OO000o o0oo000o, String str) {
        Objects.requireNonNull(o0oo000o);
        this.f14482OooOo0o = o0oo000o;
        this.f14481OooOo0O = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0OO000o o0oo000o = this.f14482OooOo0o;
        if (iBinder == null) {
            o0O0O0o0 o0o0o0o0 = o0oo000o.f14484OooOo0o.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0O0("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = o0O0O00.f26538OooOo0O;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            o000OOo oo0o0oo = iInterfaceQueryLocalInterface instanceof o000OOo ? (o000OOo) iInterfaceQueryLocalInterface : new oo0o0Oo(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            if (oo0o0oo == null) {
                o0O0O0o0 o0o0o0o02 = o0oo000o.f14484OooOo0o.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o02);
                o0o0o0o02.f14396OooOooO.OooO0O0("Install Referrer Service implementation was not found");
                return;
            }
            o0OO0oO0 o0oo0oo0 = o0oo000o.f14484OooOo0o;
            o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o03);
            o0o0o0o03.f14398Oooo0.OooO0O0("Install Referrer Service connected");
            o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
            o0OO0oO0.OooOOO0(o0oo0o00);
            o0oo0o00.OooOo00(new OooOOO0(this, oo0o0oo, this));
        } catch (RuntimeException e) {
            o0O0O0o0 o0o0o0o04 = o0oo000o.f14484OooOo0o.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o04);
            o0o0o0o04.f14396OooOooO.OooO0OO(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o0O0O0o0 o0o0o0o0 = this.f14482OooOo0o.f14484OooOo0o.f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0O0("Install Referrer Service disconnected");
    }
}
