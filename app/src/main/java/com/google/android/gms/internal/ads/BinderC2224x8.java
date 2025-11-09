package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x8 */
/* loaded from: classes2.dex */
public final class BinderC2224x8 extends AbstractBinderC1487d9 {

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final int f25550OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final int f25551OooOooo;

    /* renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f25552OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f25553OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f25554OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f25555OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f25556OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f25557OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final int f25558OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f25559OooOoo0;

    static {
        int iRgb = Color.rgb(12, 174, InterfaceC3173h3.c.b.f8815g);
        f25550OooOooO = Color.rgb(204, 204, 204);
        f25551OooOooo = iRgb;
    }

    public BinderC2224x8(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f25554OooOo0o = new ArrayList();
        this.f25552OooOo = new ArrayList();
        this.f25553OooOo0O = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            BinderC2298z8 binderC2298z8 = (BinderC2298z8) list.get(i3);
            this.f25554OooOo0o.add(binderC2298z8);
            this.f25552OooOo.add(binderC2298z8);
        }
        this.f25556OooOoO0 = num != null ? num.intValue() : f25550OooOooO;
        this.f25555OooOoO = num2 != null ? num2.intValue() : f25551OooOooo;
        this.f25557OooOoOO = num3 != null ? num3.intValue() : 12;
        this.f25559OooOoo0 = i;
        this.f25558OooOoo = i2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1523e9
    public final String zzg() {
        return this.f25553OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1523e9
    public final ArrayList zzh() {
        return this.f25552OooOo;
    }
}
