package OooOo0o;

import OooO0oo.o00Oo0;
import OooOo.OooO0o;
import OooOoO0.o0O0O00;
import OooOoO0.o0OO00O;
import OooOoO0.oo0o0Oo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.applovin.impl.sdk.C1221l;
import com.ironsource.AbstractC3887z;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f13619OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13620OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f13621OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f13622OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f13623OooOoO0;

    public /* synthetic */ OooOOOO(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.f13620OooOo0O = i2;
        this.f13619OooOo = obj;
        this.f13623OooOoO0 = obj2;
        this.f13621OooOo0o = i;
        this.f13622OooOoO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13620OooOo0O) {
            case 0:
                final OooOOo0.OooOo oooOo = (OooOOo0.OooOo) this.f13623OooOoO0;
                final int i = this.f13621OooOo0o;
                Runnable runnable = (Runnable) this.f13622OooOoO;
                final Oooo0 oooo0 = (Oooo0) this.f13619OooOo;
                o0O0O00 o0o0o00 = oooo0.f13635OooO0o;
                try {
                    try {
                        OooO0o oooO0o = oooo0.f13633OooO0OO;
                        Objects.requireNonNull(oooO0o);
                        ((OooOo.OooOo) o0o0o00).OooO0o(new o00Oo0(oooO0o, 3));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) oooo0.f13631OooO00o.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((OooOo.OooOo) o0o0o00).OooO0o(new oo0o0Oo() { // from class: OooOo0o.OooOo00
                                @Override // OooOoO0.oo0o0Oo
                                public final Object execute() {
                                    oooo0.f13634OooO0Oo.OooO00o(oooOo, i + 1, false);
                                    return null;
                                }
                            });
                        } else {
                            oooo0.OooO00o(oooOo, i);
                        }
                    } catch (o0OO00O unused) {
                        oooo0.f13634OooO0Oo.OooO00o(oooOo, i + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
            case 1:
                ((C1221l) this.f13619OooOo).m2956a((String) this.f13623OooOoO0, this.f13621OooOo0o, (String) this.f13622OooOoO);
                return;
            default:
                AbstractC3887z.m13254a((AbstractC3887z) this.f13619OooOo, (AdapterErrorType) this.f13623OooOoO0, this.f13621OooOo0o, (String) this.f13622OooOoO);
                return;
        }
    }
}
