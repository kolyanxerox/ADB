package OoooOOO;

import Oooo0OO.oo000o;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C2197wi;
import com.google.android.gms.internal.ads.C2234xi;
import com.google.android.gms.internal.ads.c50;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.f50;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0OOO0OO implements Callable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f14553OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14554OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f14555OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f14556OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f14557OooOoO0;

    public /* synthetic */ o0OOO0OO(C2197wi c2197wi, df0 df0Var, df0 df0Var2, df0 df0Var3) {
        this.f14554OooOo0O = 4;
        this.f14555OooOo0o = c2197wi;
        this.f14553OooOo = df0Var;
        this.f14557OooOoO0 = df0Var2;
        this.f14556OooOoO = df0Var3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        switch (this.f14554OooOo0O) {
            case 0:
                o0OOo000 o0ooo000 = (o0OOo000) this.f14556OooOoO;
                o0ooo000.f14568OooOo0O.OooOoo0();
                o00OO0OO o00oo0oo = o0ooo000.f14568OooOo0O.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo);
                return o00oo0oo.Oooooo0((String) this.f14555OooOo0o, (String) this.f14553OooOo, (String) this.f14557OooOoO0);
            case 1:
                o0OOo000 o0ooo0002 = (o0OOo000) this.f14556OooOoO;
                o0ooo0002.f14568OooOo0O.OooOoo0();
                o00OO0OO o00oo0oo2 = o0ooo0002.f14568OooOo0O.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo2);
                return o00oo0oo2.Oooooo0((String) this.f14555OooOo0o, (String) this.f14553OooOo, (String) this.f14557OooOoO0);
            case 2:
                o0OOo000 o0ooo0003 = (o0OOo000) this.f14556OooOoO;
                o0ooo0003.f14568OooOo0O.OooOoo0();
                o00OO0OO o00oo0oo3 = o0ooo0003.f14568OooOo0O.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo3);
                return o00oo0oo3.o0OoOo0((String) this.f14555OooOo0o, (String) this.f14553OooOo, (String) this.f14557OooOoO0);
            case 3:
                o0OOo000 o0ooo0004 = (o0OOo000) this.f14556OooOoO;
                o0ooo0004.f14568OooOo0O.OooOoo0();
                o00OO0OO o00oo0oo4 = o0ooo0004.f14568OooOo0O.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo4);
                return o00oo0oo4.o0OoOo0((String) this.f14555OooOo0o, (String) this.f14553OooOo, (String) this.f14557OooOoO0);
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && (bundle = ((C2197wi) this.f14555OooOo0o).zzm) != null) {
                    OooO00o.OooOo0O((oo000o) zzv.zzC(), bundle, "http-response-ready");
                }
                return new c50((f50) ((df0) this.f14553OooOo).f18244OooOo.get(), (JSONObject) ((df0) this.f14557OooOoO0).f18244OooOo.get(), (C2234xi) ((df0) this.f14556OooOoO).f18244OooOo.get());
        }
    }

    public o0OOO0OO(o0OOo000 o0ooo000, String str, String str2, String str3, int i) {
        this.f14554OooOo0O = i;
        switch (i) {
            case 1:
                this.f14555OooOo0o = str;
                this.f14553OooOo = str2;
                this.f14557OooOoO0 = str3;
                Objects.requireNonNull(o0ooo000);
                this.f14556OooOoO = o0ooo000;
                break;
            case 2:
                this.f14555OooOo0o = str;
                this.f14553OooOo = str2;
                this.f14557OooOoO0 = str3;
                Objects.requireNonNull(o0ooo000);
                this.f14556OooOoO = o0ooo000;
                break;
            case 3:
                this.f14555OooOo0o = str;
                this.f14553OooOo = str2;
                this.f14557OooOoO0 = str3;
                Objects.requireNonNull(o0ooo000);
                this.f14556OooOoO = o0ooo000;
                break;
            default:
                this.f14555OooOo0o = str;
                this.f14553OooOo = str2;
                this.f14557OooOoO0 = str3;
                Objects.requireNonNull(o0ooo000);
                this.f14556OooOoO = o0ooo000;
                break;
        }
    }
}
