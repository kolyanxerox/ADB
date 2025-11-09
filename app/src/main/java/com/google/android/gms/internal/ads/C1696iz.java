package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.iz */
/* loaded from: classes2.dex */
public final class C1696iz {

    /* renamed from: OooO00o */
    public final n10 f20128OooO00o;

    /* renamed from: OooO0O0 */
    public final z00 f20129OooO0O0;

    /* renamed from: OooO0OO */
    public final C2058sr f20130OooO0OO;

    /* renamed from: OooO0Oo */
    public final C1475cy f20131OooO0Oo;

    public C1696iz(n10 n10Var, z00 z00Var, C2058sr c2058sr, C1475cy c1475cy) {
        this.f20128OooO00o = n10Var;
        this.f20129OooO0O0 = z00Var;
        this.f20130OooO0OO = c2058sr;
        this.f20131OooO0Oo = c1475cy;
    }

    public final View OooO00o() {
        InterfaceC1722jo interfaceC1722joOooO00o = this.f20128OooO00o.OooO00o(zzs.zzc(), null, null);
        interfaceC1722joOooO00o.OooO0oO().setVisibility(8);
        final int i = 0;
        interfaceC1722joOooO00o.Oooo0OO("/sendMessageToSdk", new InterfaceC2042sb(this) { // from class: com.google.android.gms.internal.ads.hz

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C1696iz f19881OooOo0o;

            {
                this.f19881OooOo0o = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
            public final void OooO0o0(Object obj, Map map) {
                switch (i) {
                    case 0:
                        this.f19881OooOo0o.f20129OooO0O0.OooO0O0(map);
                        break;
                    case 1:
                        this.f19881OooOo0o.f20131OooO0Oo.OooOo0o();
                        break;
                    case 2:
                        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                        interfaceC1722jo.zzN().f21533OooOoo0 = new C1548ey(3, this.f19881OooOo0o, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC1722jo.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC1722jo.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        C1696iz c1696iz = this.f19881OooOo0o;
                        c1696iz.getClass();
                        zzo.zzi("Showing native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(0);
                        c1696iz.f20130OooO0OO.f24147OooOoOO = true;
                        break;
                    default:
                        C1696iz c1696iz2 = this.f19881OooOo0o;
                        c1696iz2.getClass();
                        zzo.zzi("Hiding native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(8);
                        c1696iz2.f20130OooO0OO.f24147OooOoOO = false;
                        break;
                }
            }
        });
        final int i2 = 1;
        interfaceC1722joOooO00o.Oooo0OO("/adMuted", new InterfaceC2042sb(this) { // from class: com.google.android.gms.internal.ads.hz

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C1696iz f19881OooOo0o;

            {
                this.f19881OooOo0o = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
            public final void OooO0o0(Object obj, Map map) {
                switch (i2) {
                    case 0:
                        this.f19881OooOo0o.f20129OooO0O0.OooO0O0(map);
                        break;
                    case 1:
                        this.f19881OooOo0o.f20131OooO0Oo.OooOo0o();
                        break;
                    case 2:
                        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                        interfaceC1722jo.zzN().f21533OooOoo0 = new C1548ey(3, this.f19881OooOo0o, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC1722jo.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC1722jo.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        C1696iz c1696iz = this.f19881OooOo0o;
                        c1696iz.getClass();
                        zzo.zzi("Showing native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(0);
                        c1696iz.f20130OooO0OO.f24147OooOoOO = true;
                        break;
                    default:
                        C1696iz c1696iz2 = this.f19881OooOo0o;
                        c1696iz2.getClass();
                        zzo.zzi("Hiding native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(8);
                        c1696iz2.f20130OooO0OO.f24147OooOoOO = false;
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(interfaceC1722joOooO00o);
        final int i3 = 2;
        InterfaceC2042sb interfaceC2042sb = new InterfaceC2042sb(this) { // from class: com.google.android.gms.internal.ads.hz

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C1696iz f19881OooOo0o;

            {
                this.f19881OooOo0o = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
            public final void OooO0o0(Object obj, Map map) {
                switch (i3) {
                    case 0:
                        this.f19881OooOo0o.f20129OooO0O0.OooO0O0(map);
                        break;
                    case 1:
                        this.f19881OooOo0o.f20131OooO0Oo.OooOo0o();
                        break;
                    case 2:
                        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                        interfaceC1722jo.zzN().f21533OooOoo0 = new C1548ey(3, this.f19881OooOo0o, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC1722jo.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC1722jo.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        C1696iz c1696iz = this.f19881OooOo0o;
                        c1696iz.getClass();
                        zzo.zzi("Showing native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(0);
                        c1696iz.f20130OooO0OO.f24147OooOoOO = true;
                        break;
                    default:
                        C1696iz c1696iz2 = this.f19881OooOo0o;
                        c1696iz2.getClass();
                        zzo.zzi("Hiding native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(8);
                        c1696iz2.f20130OooO0OO.f24147OooOoOO = false;
                        break;
                }
            }
        };
        z00 z00Var = this.f20129OooO0O0;
        z00Var.OooO0OO("/loadHtml", new y00(z00Var, weakReference, "/loadHtml", interfaceC2042sb));
        final int i4 = 3;
        z00Var.OooO0OO("/showOverlay", new y00(z00Var, new WeakReference(interfaceC1722joOooO00o), "/showOverlay", new InterfaceC2042sb(this) { // from class: com.google.android.gms.internal.ads.hz

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C1696iz f19881OooOo0o;

            {
                this.f19881OooOo0o = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
            public final void OooO0o0(Object obj, Map map) {
                switch (i4) {
                    case 0:
                        this.f19881OooOo0o.f20129OooO0O0.OooO0O0(map);
                        break;
                    case 1:
                        this.f19881OooOo0o.f20131OooO0Oo.OooOo0o();
                        break;
                    case 2:
                        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                        interfaceC1722jo.zzN().f21533OooOoo0 = new C1548ey(3, this.f19881OooOo0o, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC1722jo.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC1722jo.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        C1696iz c1696iz = this.f19881OooOo0o;
                        c1696iz.getClass();
                        zzo.zzi("Showing native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(0);
                        c1696iz.f20130OooO0OO.f24147OooOoOO = true;
                        break;
                    default:
                        C1696iz c1696iz2 = this.f19881OooOo0o;
                        c1696iz2.getClass();
                        zzo.zzi("Hiding native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(8);
                        c1696iz2.f20130OooO0OO.f24147OooOoOO = false;
                        break;
                }
            }
        }));
        final int i5 = 4;
        z00Var.OooO0OO("/hideOverlay", new y00(z00Var, new WeakReference(interfaceC1722joOooO00o), "/hideOverlay", new InterfaceC2042sb(this) { // from class: com.google.android.gms.internal.ads.hz

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C1696iz f19881OooOo0o;

            {
                this.f19881OooOo0o = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
            public final void OooO0o0(Object obj, Map map) {
                switch (i5) {
                    case 0:
                        this.f19881OooOo0o.f20129OooO0O0.OooO0O0(map);
                        break;
                    case 1:
                        this.f19881OooOo0o.f20131OooO0Oo.OooOo0o();
                        break;
                    case 2:
                        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) obj;
                        interfaceC1722jo.zzN().f21533OooOoo0 = new C1548ey(3, this.f19881OooOo0o, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            interfaceC1722jo.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            break;
                        } else {
                            interfaceC1722jo.loadData(str, "text/html", "UTF-8");
                            break;
                        }
                    case 3:
                        C1696iz c1696iz = this.f19881OooOo0o;
                        c1696iz.getClass();
                        zzo.zzi("Showing native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(0);
                        c1696iz.f20130OooO0OO.f24147OooOoOO = true;
                        break;
                    default:
                        C1696iz c1696iz2 = this.f19881OooOo0o;
                        c1696iz2.getClass();
                        zzo.zzi("Hiding native ads overlay.");
                        ((InterfaceC1722jo) obj).OooO0oO().setVisibility(8);
                        c1696iz2.f20130OooO0OO.f24147OooOoOO = false;
                        break;
                }
            }
        }));
        return interfaceC1722joOooO00o.OooO0oO();
    }
}
