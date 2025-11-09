package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.no */
/* loaded from: classes2.dex */
public abstract class AbstractC1870no extends WebViewClient implements zza, InterfaceC1401ax {

    /* renamed from: Ooooo0o */
    public static final /* synthetic */ int f21525Ooooo0o = 0;

    /* renamed from: OooOo0O */
    public final InterfaceC1722jo f21527OooOo0O;

    /* renamed from: OooOo0o */
    public final C1998r4 f21528OooOo0o;

    /* renamed from: OooOoO */
    public zza f21529OooOoO;

    /* renamed from: OooOoOO */
    public zzr f21531OooOoOO;

    /* renamed from: OooOoo */
    public InterfaceC1502dp f21532OooOoo;

    /* renamed from: OooOoo0 */
    public InterfaceC1466cp f21533OooOoo0;

    /* renamed from: OooOooO */
    public InterfaceC1746kb f21534OooOooO;

    /* renamed from: OooOooo */
    public InterfaceC1783lb f21535OooOooo;

    /* renamed from: Oooo */
    public zzac f21536Oooo;

    /* renamed from: Oooo000 */
    public InterfaceC1401ax f21538Oooo000;

    /* renamed from: Oooo00O */
    public boolean f21539Oooo00O;

    /* renamed from: Oooo00o */
    public boolean f21540Oooo00o;

    /* renamed from: Oooo0o */
    public boolean f21543Oooo0o;

    /* renamed from: Oooo0o0 */
    public boolean f21544Oooo0o0;

    /* renamed from: Oooo0oO */
    public boolean f21545Oooo0oO;

    /* renamed from: Oooo0oo */
    public boolean f21546Oooo0oo;

    /* renamed from: OoooO */
    public InterfaceC1792lk f21547OoooO;

    /* renamed from: OoooO0 */
    public zzb f21548OoooO0;

    /* renamed from: OoooO00 */
    public C2084tg f21549OoooO00;

    /* renamed from: OoooOO0 */
    public h20 f21551OoooOO0;

    /* renamed from: OoooOOO */
    public boolean f21552OoooOOO;

    /* renamed from: OoooOOo */
    public int f21553OoooOOo;

    /* renamed from: OoooOo0 */
    public boolean f21554OoooOo0;

    /* renamed from: OoooOoo */
    public final x50 f21556OoooOoo;

    /* renamed from: Ooooo00 */
    public ViewOnAttachStateChangeListenerC1796lo f21557Ooooo00;
    public boolean o000oOoO;

    /* renamed from: OooOo */
    public final HashMap f21526OooOo = new HashMap();

    /* renamed from: OooOoO0 */
    public final Object f21530OooOoO0 = new Object();

    /* renamed from: Oooo0 */
    public int f21537Oooo0 = 0;

    /* renamed from: Oooo0O0 */
    public String f21541Oooo0O0 = "";

    /* renamed from: Oooo0OO */
    public String f21542Oooo0OO = "";

    /* renamed from: OoooO0O */
    public C1973qg f21550OoooO0O = null;

    /* renamed from: OoooOoO */
    public final HashSet f21555OoooOoO = new HashSet(Arrays.asList(((String) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOoOo)).split(",")));

    public AbstractC1870no(InterfaceC1722jo interfaceC1722jo, C1998r4 c1998r4, boolean z, C2084tg c2084tg, x50 x50Var) {
        this.f21528OooOo0o = c1998r4;
        this.f21527OooOo0O = interfaceC1722jo;
        this.f21544Oooo0o0 = z;
        this.f21549OoooO00 = c2084tg;
        this.f21556OoooOoo = x50Var;
    }

    public static WebResourceResponse Oooo0oO() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17785o0000O0O)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean OoooOOO(InterfaceC1722jo interfaceC1722jo) {
        return interfaceC1722jo.OooO0OO() != null && interfaceC1722jo.OooO0OO().OooO0O0();
    }

    public static final boolean OoooOOo(boolean z, InterfaceC1722jo interfaceC1722jo) {
        return (!z || interfaceC1722jo.zzO().OooO0O0() || interfaceC1722jo.OooOo0o().equals("interstitial_mb")) ? false : true;
    }

    public final void OooO00o(String str, InterfaceC2042sb interfaceC2042sb) {
        synchronized (this.f21530OooOoO0) {
            try {
                List copyOnWriteArrayList = (List) this.f21526OooOo.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.f21526OooOo.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC2042sb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o(C1468cr c1468cr, s50 s50Var, h20 h20Var) {
        OooO0oo("/open");
        OooO00o("/open", new C2264yb(this.f21548OoooO0, this.f21550OoooO0O, s50Var, h20Var, c1468cr));
    }

    public final void OooO0o0(C1468cr c1468cr, s50 s50Var, hg0 hg0Var) {
        OooO0oo("/click");
        if (s50Var == null || hg0Var == null) {
            OooO00o("/click", new C1895ob(0, this.f21538Oooo000, c1468cr));
        } else {
            OooO00o("/click", new y00(this.f21538Oooo000, c1468cr, hg0Var, s50Var));
        }
    }

    public final void OooO0oo(String str) {
        synchronized (this.f21530OooOoO0) {
            try {
                List list = (List) this.f21526OooOo.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooOO0() {
        boolean z;
        synchronized (this.f21530OooOoO0) {
            z = this.f21543Oooo0o;
        }
        return z;
    }

    public final void OooOOO(zza zzaVar, InterfaceC1746kb interfaceC1746kb, zzr zzrVar, InterfaceC1783lb interfaceC1783lb, zzac zzacVar, boolean z, C2116ub c2116ub, zzb zzbVar, C1847n1 c1847n1, InterfaceC1792lk interfaceC1792lk, s50 s50Var, hg0 hg0Var, h20 h20Var, C2079tb c2079tb, InterfaceC1401ax interfaceC1401ax, C1709jb c1709jb, C1709jb c1709jb2, C2079tb c2079tb2, C1468cr c1468cr) {
        InterfaceC1722jo interfaceC1722jo = this.f21527OooOo0O;
        zzb zzbVar2 = zzbVar == null ? new zzb(interfaceC1722jo.getContext(), interfaceC1792lk, null) : zzbVar;
        this.f21550OoooO0O = new C1973qg(interfaceC1722jo, c1847n1);
        this.f21547OoooO = interfaceC1792lk;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17789o0000OOo)).booleanValue()) {
            OooO00o("/adMetadata", new C1709jb(interfaceC1746kb, 0));
        }
        if (interfaceC1783lb != null) {
            OooO00o("/appEvent", new C1709jb(interfaceC1783lb, 1));
        }
        OooO00o("/backButton", AbstractC2005rb.f23825OooOO0);
        OooO00o("/refresh", AbstractC2005rb.f23826OooOO0O);
        OooO00o("/canOpenApp", AbstractC2005rb.f23818OooO0O0);
        OooO00o("/canOpenURLs", AbstractC2005rb.f23817OooO00o);
        OooO00o("/canOpenIntents", AbstractC2005rb.f23819OooO0OO);
        OooO00o("/close", AbstractC2005rb.f23820OooO0Oo);
        OooO00o("/customClose", AbstractC2005rb.f23822OooO0o0);
        OooO00o("/instrument", AbstractC2005rb.f23827OooOOO);
        OooO00o("/delayPageLoaded", AbstractC2005rb.f23830OooOOOo);
        OooO00o("/delayPageClosed", AbstractC2005rb.f23832OooOOo0);
        OooO00o("/getLocationInfo", AbstractC2005rb.f23831OooOOo);
        OooO00o("/log", AbstractC2005rb.f23823OooO0oO);
        OooO00o("/mraid", new C2153vb(zzbVar2, this.f21550OoooO0O, c1847n1));
        C2084tg c2084tg = this.f21549OoooO00;
        if (c2084tg != null) {
            OooO00o("/mraidLoaded", c2084tg);
        }
        zzb zzbVar3 = zzbVar2;
        OooO00o("/open", new C2264yb(zzbVar3, this.f21550OoooO0O, s50Var, h20Var, c1468cr));
        OooO00o("/precache", new C1820mb(27));
        OooO00o("/touch", AbstractC2005rb.f23816OooO);
        OooO00o("/video", AbstractC2005rb.OooOO0o);
        OooO00o("/videoMeta", AbstractC2005rb.f23828OooOOO0);
        if (s50Var == null || hg0Var == null) {
            OooO00o("/click", new C1895ob(0, interfaceC1401ax, c1468cr));
            OooO00o("/httpTrack", AbstractC2005rb.f23821OooO0o);
        } else {
            OooO00o("/click", new y00(interfaceC1401ax, c1468cr, hg0Var, s50Var));
            OooO00o("/httpTrack", new C1895ob(6, hg0Var, s50Var));
        }
        if (zzv.zzo().OooO0o0(interfaceC1722jo.getContext())) {
            Object map = new HashMap();
            if (interfaceC1722jo.OooO0OO() != null) {
                map = interfaceC1722jo.OooO0OO().o0ooOoO;
            }
            OooO00o("/logScionEvent", new C1895ob(1, interfaceC1722jo.getContext(), map));
        }
        if (c2116ub != null) {
            OooO00o("/setInterstitialProperties", new C1709jb(c2116ub, 2));
        }
        if (c2079tb != null) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOO0O0)).booleanValue()) {
                OooO00o("/inspectorNetworkExtras", c2079tb);
            }
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOo0)).booleanValue() && c1709jb != null) {
            OooO00o("/shareSheet", c1709jb);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoO)).booleanValue() && c1709jb2 != null) {
            OooO00o("/inspectorOutOfContextTest", c1709jb2);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOooO)).booleanValue() && c2079tb2 != null) {
            OooO00o("/inspectorStorage", c2079tb2);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoooO0)).booleanValue()) {
            OooO00o("/bindPlayStoreOverlay", AbstractC2005rb.OooOo0);
            OooO00o("/presentPlayStoreOverlay", AbstractC2005rb.f23836OooOo0O);
            OooO00o("/expandPlayStoreOverlay", AbstractC2005rb.f23837OooOo0o);
            OooO00o("/collapsePlayStoreOverlay", AbstractC2005rb.f23834OooOo);
            OooO00o("/closePlayStoreOverlay", AbstractC2005rb.f23839OooOoO0);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17894o00OO0OO)).booleanValue()) {
            OooO00o("/setPAIDPersonalizationEnabled", AbstractC2005rb.f23840OooOoOO);
            OooO00o("/resetPAID", AbstractC2005rb.f23838OooOoO);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000)).booleanValue() && interfaceC1722jo.OooO0OO() != null && interfaceC1722jo.OooO0OO().f20556oo000o) {
            OooO00o("/writeToLocalStorage", AbstractC2005rb.f23842OooOoo0);
            OooO00o("/clearLocalStorageKeys", AbstractC2005rb.f23841OooOoo);
        }
        this.f21529OooOoO = zzaVar;
        this.f21531OooOoOO = zzrVar;
        this.f21534OooOooO = interfaceC1746kb;
        this.f21535OooOooo = interfaceC1783lb;
        this.f21536Oooo = zzacVar;
        this.f21548OoooO0 = zzbVar3;
        this.f21538Oooo000 = interfaceC1401ax;
        this.f21551OoooOO0 = h20Var;
        this.f21539Oooo00O = z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void Oooo000() {
        InterfaceC1401ax interfaceC1401ax = this.f21538Oooo000;
        if (interfaceC1401ax != null) {
            interfaceC1401ax.Oooo000();
        }
    }

    public final void OoooO0(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2042sb) it.next()).OooO0o0(this.f21527OooOo0O, map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x00f4, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.zzv.zzq();
        r0 = r12.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0102, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0106, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0108, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x010a, code lost:
    
        r14 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0115, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzq();
        r0 = r12.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0120, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0122, code lost:
    
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0124, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0129, code lost:
    
        if (r0.length != 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x012c, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x012e, code lost:
    
        if (r2 >= r0.length) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x013c, code lost:
    
        if (r0[r2].trim().startsWith(com.ironsource.C3037dc.f8237M) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x013e, code lost:
    
        r4 = r0[r2].trim().split(com.ironsource.C3034d9.i.f8173b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x014b, code lost:
    
        if (r4.length <= 1) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x014d, code lost:
    
        r6 = r4[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0154, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0157, code lost:
    
        r0 = r12.getHeaderFields();
        r2 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0170, code lost:
    
        if (r0.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0172, code lost:
    
        r4 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x017c, code lost:
    
        if (r4.getKey() == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0182, code lost:
    
        if (r4.getValue() == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x018e, code lost:
    
        if (r4.getValue().isEmpty() != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0190, code lost:
    
        r2.put(r4.getKey(), r4.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a6, code lost:
    
        r7 = com.google.android.gms.ads.internal.zzv.zzr().zzb(r14, r15, r12.getResponseCode(), r12.getResponseMessage(), r2, r12.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse OoooO00(java.lang.String r21, java.util.Map r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1870no.OoooO00(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooO0O(android.view.View r8, com.google.android.gms.internal.ads.InterfaceC1792lk r9, int r10) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.jk r9 = (com.google.android.gms.internal.ads.C1718jk) r9
            com.google.android.gms.internal.ads.kk r0 = r9.f20324OooO0oO
            boolean r0 = r0.zzc
            if (r0 == 0) goto La1
            boolean r1 = r9.f20326OooOO0
            if (r1 != 0) goto La1
            if (r10 <= 0) goto La1
            if (r0 != 0) goto L12
            goto L8b
        L12:
            if (r1 != 0) goto L8b
            com.google.android.gms.ads.internal.zzv.zzq()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L1c
            goto L77
        L1c:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L2e
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L2e
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L2e
            if (r3 == 0) goto L30
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L2e
            goto L31
        L2e:
            r2 = move-exception
            goto L37
        L30:
            r3 = r1
        L31:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L35
            goto L3d
        L35:
            r2 = move-exception
            goto L38
        L37:
            r3 = r1
        L38:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r2)
        L3d:
            if (r3 != 0) goto L76
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L68
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L68
            if (r2 == 0) goto L6a
            if (r3 != 0) goto L4c
            goto L6a
        L4c:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L68
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L68
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L68
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L68
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L68
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L68
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L68
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L68
            r1 = r4
            goto L77
        L68:
            r2 = move-exception
            goto L70
        L6a:
            java.lang.String r2 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)     // Catch: java.lang.RuntimeException -> L68
            goto L77
        L70:
            java.lang.String r3 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r3, r2)
            goto L77
        L76:
            r1 = r3
        L77:
            if (r1 != 0) goto L7f
            java.lang.String r0 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.ze0.OooOOOO(r0)
            goto L8b
        L7f:
            r9.f20326OooOO0 = r0
            com.google.android.gms.internal.ads.wp0 r0 = new com.google.android.gms.internal.ads.wp0
            r2 = 11
            r0.<init>(r2, r9, r1)
            com.google.android.gms.ads.internal.util.zzs.zzh(r0)
        L8b:
            com.google.android.gms.internal.ads.kk r0 = r9.f20324OooO0oO
            boolean r0 = r0.zzc
            if (r0 == 0) goto La1
            boolean r0 = r9.f20326OooOO0
            if (r0 != 0) goto La1
            com.google.android.gms.internal.ads.pj0 r0 = com.google.android.gms.ads.internal.util.zzs.zza
            com.google.android.gms.internal.ads.ln r1 = new com.google.android.gms.internal.ads.ln
            r1.<init>(r7, r8, r9, r10)
            r8 = 100
            r0.postDelayed(r1, r8)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1870no.OoooO0O(android.view.View, com.google.android.gms.internal.ads.lk, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c2 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TRY_ENTER, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:128:0x000e, B:130:0x0019, B:135:0x0026, B:137:0x0036, B:139:0x003d, B:141:0x0049, B:143:0x0066, B:145:0x0082, B:147:0x0099, B:149:0x009f, B:153:0x00a8, B:156:0x00c2, B:159:0x00ca, B:161:0x00d6, B:163:0x00ef, B:180:0x0158, B:181:0x0184, B:229:0x02d5, B:233:0x02e9, B:235:0x02ef, B:237:0x02fd, B:217:0x0226, B:210:0x01d9, B:218:0x0254, B:219:0x0282, B:162:0x00e3, B:220:0x0283, B:222:0x028d, B:224:0x0293, B:226:0x02c6), top: B:245:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x021c A[Catch: all -> 0x01cc, TryCatch #8 {all -> 0x01cc, blocks: (B:213:0x020a, B:215:0x021c, B:216:0x0223, B:204:0x01b2, B:206:0x01c4, B:209:0x01cf), top: B:244:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0283 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:128:0x000e, B:130:0x0019, B:135:0x0026, B:137:0x0036, B:139:0x003d, B:141:0x0049, B:143:0x0066, B:145:0x0082, B:147:0x0099, B:149:0x009f, B:153:0x00a8, B:156:0x00c2, B:159:0x00ca, B:161:0x00d6, B:163:0x00ef, B:180:0x0158, B:181:0x0184, B:229:0x02d5, B:233:0x02e9, B:235:0x02ef, B:237:0x02fd, B:217:0x0226, B:210:0x01d9, B:218:0x0254, B:219:0x0282, B:162:0x00e3, B:220:0x0283, B:222:0x028d, B:224:0x0293, B:226:0x02c6), top: B:245:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d5 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:128:0x000e, B:130:0x0019, B:135:0x0026, B:137:0x0036, B:139:0x003d, B:141:0x0049, B:143:0x0066, B:145:0x0082, B:147:0x0099, B:149:0x009f, B:153:0x00a8, B:156:0x00c2, B:159:0x00ca, B:161:0x00d6, B:163:0x00ef, B:180:0x0158, B:181:0x0184, B:229:0x02d5, B:233:0x02e9, B:235:0x02ef, B:237:0x02fd, B:217:0x0226, B:210:0x01d9, B:218:0x0254, B:219:0x0282, B:162:0x00e3, B:220:0x0283, B:222:0x028d, B:224:0x0293, B:226:0x02c6), top: B:245:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e5  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.os.ParcelFileDescriptor$AutoCloseInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.n4, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse OoooOo0(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1870no.OoooOo0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void Ooooo00() {
        InterfaceC1466cp interfaceC1466cp = this.f21533OooOoo0;
        InterfaceC1722jo interfaceC1722jo = this.f21527OooOo0O;
        if (interfaceC1466cp != null && ((this.o000oOoO && this.f21553OoooOOo <= 0) || this.f21552OoooOOO || this.f21540Oooo00o)) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue() && interfaceC1722jo.zzm() != null) {
                ze0.OooOOO0((C1669i7) interfaceC1722jo.zzm().f25813OooOo, interfaceC1722jo.zzk(), "awfllc");
            }
            InterfaceC1466cp interfaceC1466cp2 = this.f21533OooOoo0;
            boolean z = false;
            if (!this.f21552OoooOOO && !this.f21540Oooo00o) {
                z = true;
            }
            interfaceC1466cp2.zza(z, this.f21537Oooo0, this.f21541Oooo0O0, this.f21542Oooo0OO);
            this.f21533OooOoo0 = null;
        }
        interfaceC1722jo.OooOoOO();
    }

    public final void Oooooo0() {
        InterfaceC1792lk interfaceC1792lk = this.f21547OoooO;
        if (interfaceC1792lk != null) {
            C1718jk c1718jk = (C1718jk) interfaceC1792lk;
            synchronized (c1718jk.f20325OooO0oo) {
                c1718jk.f20319OooO0O0.keySet();
                yp0 yp0VarOooooOO = ii0.OooooOO(Collections.EMPTY_MAP);
                C2043sc c2043sc = new C2043sc(c1718jk, 1);
                C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
                dp0 dp0VarOoOO = ii0.ooOO(yp0VarOooooOO, c2043sc, c2163vl);
                o00000oO.OooOOO oooOOOO00Oo0 = ii0.o00Oo0(dp0VarOoOO, 10L, TimeUnit.SECONDS, AbstractC2200wl.f25324OooO0Oo);
                dp0VarOoOO.addListener(new wp0(0, dp0VarOoOO, new C1847n1(oooOOOO00Oo0, 9)), c2163vl);
                C1718jk.OooOO0o.add(oooOOOO00Oo0);
            }
            this.f21547OoooO = null;
        }
        ViewOnAttachStateChangeListenerC1796lo viewOnAttachStateChangeListenerC1796lo = this.f21557Ooooo00;
        if (viewOnAttachStateChangeListenerC1796lo != null) {
            ((View) this.f21527OooOo0O).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1796lo);
        }
        synchronized (this.f21530OooOoO0) {
            try {
                this.f21526OooOo.clear();
                this.f21529OooOoO = null;
                this.f21531OooOoOO = null;
                this.f21533OooOoo0 = null;
                this.f21532OooOoo = null;
                this.f21534OooOooO = null;
                this.f21535OooOooo = null;
                this.f21539Oooo00O = false;
                this.f21544Oooo0o0 = false;
                this.f21543Oooo0o = false;
                this.f21545Oooo0oO = false;
                this.f21536Oooo = null;
                this.f21548OoooO0 = null;
                this.f21549OoooO00 = null;
                C1973qg c1973qg = this.f21550OoooO0O;
                if (c1973qg != null) {
                    c1973qg.OooOOo(true);
                    this.f21550OoooO0O = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o00o0O(Uri uri) {
        zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.f21526OooOo;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O00O0)).booleanValue() || zzv.zzp().OooO0OO() == null) {
                return;
            }
            AbstractC2200wl.f25321OooO00o.execute(new RunnableC1442c1((path == null || path.length() < 2) ? "null" : path.substring(1), 17));
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOoOO)).booleanValue() && this.f21555OoooOoO.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOoo0)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                o00000oO.OooOOO oooOOOZzb = zzv.zzq().zzb(uri);
                oooOOOZzb.addListener(new wp0(0, oooOOOZzb, new C1386ai(this, list, path, uri)), AbstractC2200wl.f25325OooO0o);
                return;
            }
        }
        zzv.zzq();
        OoooO0(zzs.zzP(uri), list, path);
    }

    public final void o0OO00O(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        C1973qg c1973qg = this.f21550OoooO0O;
        if (c1973qg != null) {
            synchronized (c1973qg.f23602Oooo00O) {
                z = c1973qg.f23608Oooo0oO != null;
            }
        }
        zzv.zzj();
        zzn.zza(this.f21527OooOo0O.getContext(), adOverlayInfoParcel, !z, this.f21551OoooOO0);
        InterfaceC1792lk interfaceC1792lk = this.f21547OoooO;
        if (interfaceC1792lk != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            ((C1718jk) interfaceC1792lk).OooO0O0(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0OOO0o() {
        InterfaceC1792lk interfaceC1792lk = this.f21547OoooO;
        if (interfaceC1792lk != null) {
            InterfaceC1722jo interfaceC1722jo = this.f21527OooOo0O;
            WebView webViewOooOOo = interfaceC1722jo.OooOOo();
            if (ViewCompat.isAttachedToWindow(webViewOooOOo)) {
                OoooO0O(webViewOooOOo, interfaceC1792lk, 10);
                return;
            }
            ViewOnAttachStateChangeListenerC1796lo viewOnAttachStateChangeListenerC1796lo = this.f21557Ooooo00;
            if (viewOnAttachStateChangeListenerC1796lo != null) {
                ((View) interfaceC1722jo).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1796lo);
            }
            ViewOnAttachStateChangeListenerC1796lo viewOnAttachStateChangeListenerC1796lo2 = new ViewOnAttachStateChangeListenerC1796lo(this, interfaceC1792lk);
            this.f21557Ooooo00 = viewOnAttachStateChangeListenerC1796lo2;
            ((View) interfaceC1722jo).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1796lo2);
        }
    }

    public final void o0Oo0oo(zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        InterfaceC1722jo interfaceC1722jo = this.f21527OooOo0O;
        boolean zOooOOoo = interfaceC1722jo.OooOOoo();
        boolean z4 = false;
        boolean z5 = OoooOOo(zOooOOoo, interfaceC1722jo) || z2;
        if (z5 || !z) {
            z3 = zOooOOoo;
            z4 = true;
        } else {
            z3 = zOooOOoo;
        }
        o0OO00O(new AdOverlayInfoParcel(zzcVar, z5 ? null : this.f21529OooOoO, z3 ? null : this.f21531OooOoOO, this.f21536Oooo, interfaceC1722jo.zzn(), interfaceC1722jo, z4 ? null : this.f21538Oooo000, str));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.f21529OooOoO;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            o00o0O(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f21530OooOoO0) {
            try {
                if (this.f21527OooOo0O.OooOOO0()) {
                    zze.zza("Blank page loaded, 1...");
                    this.f21527OooOo0O.zzX();
                    return;
                }
                this.o000oOoO = true;
                InterfaceC1502dp interfaceC1502dp = this.f21532OooOoo;
                if (interfaceC1502dp != null) {
                    interfaceC1502dp.mo13707zza();
                    this.f21532OooOoo = null;
                }
                Ooooo00();
                if (this.f21527OooOo0O.zzL() != null) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000O0)).booleanValue()) {
                        this.f21527OooOo0O.zzL().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f21540Oooo00o = true;
        this.f21537Oooo0 = i;
        this.f21541Oooo0O0 = str;
        this.f21542Oooo0OO = str2;
    }

    public final void oo000o(int i, int i2) {
        C2084tg c2084tg = this.f21549OoooO00;
        if (c2084tg != null) {
            c2084tg.OooOOo(i, i2);
        }
        C1973qg c1973qg = this.f21550OoooO0O;
        if (c1973qg != null) {
            synchronized (c1973qg.f23602Oooo00O) {
                c1973qg.f23594OooOoOO = i;
                c1973qg.f23596OooOoo0 = i2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return OoooOo0(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriOooO00o = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriOooO00o.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriOooO00o.getHost())) {
            o00o0O(uriOooO00o);
            return true;
        }
        boolean z = this.f21539Oooo00O;
        InterfaceC1722jo interfaceC1722jo = this.f21527OooOo0O;
        if (z && webView == interfaceC1722jo.OooOOo()) {
            String scheme = uriOooO00o.getScheme();
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zza zzaVar = this.f21529OooOoO;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                    InterfaceC1792lk interfaceC1792lk = this.f21547OoooO;
                    if (interfaceC1792lk != null) {
                        ((C1718jk) interfaceC1792lk).OooO0O0(str);
                    }
                    this.f21529OooOoO = null;
                }
                InterfaceC1401ax interfaceC1401ax = this.f21538Oooo000;
                if (interfaceC1401ax != null) {
                    interfaceC1401ax.Oooo000();
                    this.f21538Oooo000 = null;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        }
        if (interfaceC1722jo.OooOOo().willNotDraw()) {
            zzo.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            return true;
        }
        try {
            C1663i1 c1663i1OooO0Oo = interfaceC1722jo.OooO0Oo();
            xd0 xd0VarOoooooO = interfaceC1722jo.OoooooO();
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o000oO)).booleanValue() || xd0VarOoooooO == null) {
                if (c1663i1OooO0Oo != null && c1663i1OooO0Oo.OooO0OO(uriOooO00o)) {
                    uriOooO00o = c1663i1OooO0Oo.OooO00o(uriOooO00o, interfaceC1722jo.getContext(), (View) interfaceC1722jo, interfaceC1722jo.zzi());
                }
            } else if (c1663i1OooO0Oo != null && c1663i1OooO0Oo.OooO0OO(uriOooO00o)) {
                uriOooO00o = xd0VarOoooooO.OooO00o(uriOooO00o, interfaceC1722jo.getContext(), (View) interfaceC1722jo, interfaceC1722jo.zzi());
            }
        } catch (C1699j1 unused) {
            zzo.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
        }
        zzb zzbVar = this.f21548OoooO0;
        if (zzbVar == null || zzbVar.zzc()) {
            o0Oo0oo(new zzc("android.intent.action.VIEW", uriOooO00o.toString(), null, null, null, null, null, null), true, false, interfaceC1722jo.zzr());
        } else {
            zzbVar.zzb(str);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final void zzu() {
        InterfaceC1401ax interfaceC1401ax = this.f21538Oooo000;
        if (interfaceC1401ax != null) {
            interfaceC1401ax.zzu();
        }
    }
}
