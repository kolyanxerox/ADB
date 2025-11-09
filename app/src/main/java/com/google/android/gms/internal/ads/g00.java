package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.ironsource.C3007ch;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class g00 implements InterfaceC1481d3 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19154OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1722jo f19155OooOo0o;

    public /* synthetic */ g00(InterfaceC1722jo interfaceC1722jo, int i) {
        this.f19154OooOo0O = i;
        this.f19155OooOo0o = interfaceC1722jo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        switch (this.f19154OooOo0O) {
            case 0:
                AbstractC1870no abstractC1870noZzN = this.f19155OooOo0o.zzN();
                Rect rect = c1444c3.f17663OooO0Oo;
                abstractC1870noZzN.oo000o(rect.left, rect.top);
                break;
            case 1:
                HashMap map = new HashMap();
                map.put(C3007ch.f7750k, true != c1444c3.f17668OooOO0 ? "0" : "1");
                this.f19155OooOo0o.OooO0o("onAdVisibilityChanged", map);
                break;
            default:
                AbstractC1870no abstractC1870noZzN2 = this.f19155OooOo0o.zzN();
                Rect rect2 = c1444c3.f17663OooO0Oo;
                abstractC1870noZzN2.oo000o(rect2.left, rect2.top);
                break;
        }
    }
}
