package o00;

import OooO0oO.Oooo0;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.C2001r7;
import java.util.HashMap;
import o00000oO.OooOOO0;
import o000Oo0O.OooOo00;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class OooO00o extends QueryInfoGenerationCallback {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f28884OooO00o;

    /* renamed from: OooO0O0 */
    public String f28885OooO0O0;

    /* renamed from: OooO0OO */
    public Object f28886OooO0OO;

    public /* synthetic */ OooO00o(int i) {
        this.f28884OooO00o = i;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        OooOOO0 oooOOO0;
        OooOOO0 oooOOO02;
        switch (this.f28884OooO00o) {
            case 0:
                OooOo00 oooOo00 = (OooOo00) this.f28886OooO0OO;
                ((OooOo00) oooOo00.f30370OooOo).f30370OooOo = str;
                Oooo0 oooo0 = (Oooo0) oooOo00.f30372OooOo0o;
                synchronized (oooo0) {
                    int i = oooo0.f13285OooOo0o - 1;
                    oooo0.f13285OooOo0o = i;
                    if (i <= 0 && (oooOOO0 = (OooOOO0) oooo0.f13283OooOo) != null) {
                        oooOOO0.run();
                    }
                }
                return;
            case 1:
                OooOo00 oooOo002 = (OooOo00) this.f28886OooO0OO;
                ((OooOo00) oooOo002.f30370OooOo).f30370OooOo = str;
                Oooo0 oooo02 = (Oooo0) oooOo002.f30372OooOo0o;
                synchronized (oooo02) {
                    int i2 = oooo02.f13285OooOo0o - 1;
                    oooo02.f13285OooOo0o = i2;
                    if (i2 <= 0 && (oooOOO02 = (OooOOO0) oooo02.f13283OooOo) != null) {
                        oooOOO02.run();
                    }
                }
                return;
            default:
                zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    C2001r7 c2001r7 = (C2001r7) this.f28886OooO0OO;
                    c2001r7.f23791OooO0oO.postMessage(c2001r7.OooO00o(this.f28885OooO0O0, str).toString(), null);
                    return;
                } catch (JSONException e) {
                    zzo.zzh("Error creating PACT Error Response JSON: ", e);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        OooOOO0 oooOOO0;
        OooOOO0 oooOOO02;
        switch (this.f28884OooO00o) {
            case 0:
                String query = queryInfo.getQuery();
                OooOo00 oooOo00 = (OooOo00) this.f28886OooO0OO;
                ((HashMap) ((OooOo00) oooOo00.f30370OooOo).f30372OooOo0o).put(this.f28885OooO0O0, query);
                Oooo0 oooo0 = (Oooo0) oooOo00.f30372OooOo0o;
                synchronized (oooo0) {
                    int i = oooo0.f13285OooOo0o - 1;
                    oooo0.f13285OooOo0o = i;
                    if (i <= 0 && (oooOOO0 = (OooOOO0) oooo0.f13283OooOo) != null) {
                        oooOOO0.run();
                    }
                }
                return;
            case 1:
                String query2 = queryInfo.getQuery();
                OooOo00 oooOo002 = (OooOo00) this.f28886OooO0OO;
                ((HashMap) ((OooOo00) oooOo002.f30370OooOo).f30372OooOo0o).put(this.f28885OooO0O0, query2);
                Oooo0 oooo02 = (Oooo0) oooOo002.f30372OooOo0o;
                synchronized (oooo02) {
                    int i2 = oooo02.f13285OooOo0o - 1;
                    oooo02.f13285OooOo0o = i2;
                    if (i2 <= 0 && (oooOOO02 = (OooOOO0) oooo02.f13283OooOo) != null) {
                        oooOOO02.run();
                    }
                }
                return;
            default:
                String query3 = queryInfo.getQuery();
                try {
                    C2001r7 c2001r7 = (C2001r7) this.f28886OooO0OO;
                    c2001r7.f23791OooO0oO.postMessage(c2001r7.OooO0O0(this.f28885OooO0O0, query3).toString(), null);
                    return;
                } catch (JSONException e) {
                    zzo.zzh("Error creating PACT Signal Response JSON: ", e);
                    return;
                }
        }
    }

    public OooO00o(C2001r7 c2001r7, String str) {
        this.f28884OooO00o = 2;
        this.f28885OooO0O0 = str;
        this.f28886OooO0OO = c2001r7;
    }
}
