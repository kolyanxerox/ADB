package OooOOo;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0oO.OooOOO0 f13453OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f13454OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f13455OooO0OO;

    public Oooo000(Context context, OooOo00 oooOo00) {
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(context, 3, false);
        this.f13455OooO0OO = new HashMap();
        this.f13453OooO00o = oooOOO0;
        this.f13454OooO0O0 = oooOo00;
    }

    public final synchronized Oooo0 OooO00o(String str) {
        if (this.f13455OooO0OO.containsKey(str)) {
            return (Oooo0) this.f13455OooO0OO.get(str);
        }
        CctBackendFactory cctBackendFactoryOooO0O0 = this.f13453OooO00o.OooO0O0(str);
        if (cctBackendFactoryOooO0O0 == null) {
            return null;
        }
        OooOo00 oooOo00 = this.f13454OooO0O0;
        Oooo0 oooo0Create = cctBackendFactoryOooO0O0.create(new OooOOO0(oooOo00.f13450OooO00o, oooOo00.f13451OooO0O0, oooOo00.f13452OooO0OO, str));
        this.f13455OooO0OO.put(str, oooo0Create);
        return oooo0Create;
    }
}
