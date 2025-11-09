package o00OOO0;

import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class o00Ooo {

    /* renamed from: OooO */
    public final SocketFactory f32248OooO;

    /* renamed from: OooO00o */
    public final C2051sk f32249OooO00o;

    /* renamed from: OooO0O0 */
    public final List f32250OooO0O0;

    /* renamed from: OooO0OO */
    public final List f32251OooO0OO;

    /* renamed from: OooO0Oo */
    public final ArrayList f32252OooO0Oo;

    /* renamed from: OooO0o */
    public final OooO0O0 f32253OooO0o;

    /* renamed from: OooO0o0 */
    public final ArrayList f32254OooO0o0;

    /* renamed from: OooO0oO */
    public final ProxySelector f32255OooO0oO;

    /* renamed from: OooO0oo */
    public final OooO0O0 f32256OooO0oo;

    /* renamed from: OooOO0 */
    public final SSLSocketFactory f32257OooOO0;

    /* renamed from: OooOO0O */
    public final o0OO0O0 f32258OooOO0O;
    public final o00OOOo.OooOOOO OooOO0o;

    /* renamed from: OooOOO */
    public final OooO0O0 f32259OooOOO;

    /* renamed from: OooOOO0 */
    public final OooOO0O f32260OooOOO0;

    /* renamed from: OooOOOO */
    public final OooO0O0 f32261OooOOOO;

    /* renamed from: OooOOOo */
    public final OooOOOO f32262OooOOOo;

    /* renamed from: OooOOo */
    public final boolean f32263OooOOo;

    /* renamed from: OooOOo0 */
    public final OooO0O0 f32264OooOOo0;

    /* renamed from: OooOOoo */
    public final boolean f32265OooOOoo;
    public int OooOo0;

    /* renamed from: OooOo00 */
    public final boolean f32266OooOo00;

    /* renamed from: OooOo0O */
    public int f32267OooOo0O;

    /* renamed from: OooOo0o */
    public int f32268OooOo0o;

    public o00Ooo() {
        this.f32252OooO0Oo = new ArrayList();
        this.f32254OooO0o0 = new ArrayList();
        this.f32249OooO00o = new C2051sk(24);
        this.f32250OooO0O0 = oo000o.f32303OoooO0O;
        this.f32251OooO0OO = oo000o.f32302OoooO;
        this.f32253OooO0o = new OooO0O0();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f32255OooO0oO = proxySelector;
        if (proxySelector == null) {
            this.f32255OooO0oO = new o00OOOo0.OooOOO();
        }
        this.f32256OooO0oo = OooO0O0.f32134OooO0O0;
        this.f32248OooO = SocketFactory.getDefault();
        this.OooOO0o = o00OOOo.OooOOOO.f32532OooO00o;
        this.f32260OooOOO0 = OooOO0O.f32153OooO0OO;
        OooO0O0 oooO0O0 = OooO0O0.f32133OooO00o;
        this.f32259OooOOO = oooO0O0;
        this.f32261OooOOOO = oooO0O0;
        this.f32262OooOOOo = new OooOOOO();
        this.f32264OooOOo0 = OooO0O0.f32135OooO0OO;
        this.f32263OooOOo = true;
        this.f32265OooOOoo = true;
        this.f32266OooOo00 = true;
        this.OooOo0 = 10000;
        this.f32267OooOo0O = 10000;
        this.f32268OooOo0o = 10000;
    }

    public o00Ooo(oo000o oo000oVar) {
        ArrayList arrayList = new ArrayList();
        this.f32252OooO0Oo = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f32254OooO0o0 = arrayList2;
        this.f32249OooO00o = oo000oVar.f32305OooOo0O;
        this.f32250OooO0O0 = oo000oVar.f32306OooOo0o;
        this.f32251OooO0OO = oo000oVar.f32304OooOo;
        arrayList.addAll(oo000oVar.f32308OooOoO0);
        arrayList2.addAll(oo000oVar.f32307OooOoO);
        this.f32253OooO0o = oo000oVar.f32309OooOoOO;
        this.f32255OooO0oO = oo000oVar.f32311OooOoo0;
        this.f32256OooO0oo = oo000oVar.f32310OooOoo;
        this.f32248OooO = oo000oVar.f32312OooOooO;
        this.f32257OooOO0 = oo000oVar.f32313OooOooo;
        this.f32258OooOO0O = oo000oVar.f32316Oooo000;
        this.OooOO0o = oo000oVar.f32317Oooo00O;
        this.f32260OooOOO0 = oo000oVar.f32318Oooo00o;
        this.f32259OooOOO = oo000oVar.f32315Oooo0;
        this.f32261OooOOOO = oo000oVar.f32319Oooo0O0;
        this.f32262OooOOOo = oo000oVar.f32320Oooo0OO;
        this.f32264OooOOo0 = oo000oVar.f32322Oooo0o0;
        this.f32263OooOOo = oo000oVar.f32321Oooo0o;
        this.f32265OooOOoo = oo000oVar.f32323Oooo0oO;
        this.f32266OooOo00 = oo000oVar.f32324Oooo0oo;
        this.OooOo0 = oo000oVar.f32314Oooo;
        this.f32267OooOo0O = oo000oVar.f32326OoooO00;
        this.f32268OooOo0o = oo000oVar.f32325OoooO0;
    }
}
