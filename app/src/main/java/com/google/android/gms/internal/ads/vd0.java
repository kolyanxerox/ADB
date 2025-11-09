package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vd0 {

    /* renamed from: OooO */
    public final C1414b9 f24950OooO;

    /* renamed from: OooO00o */
    public final zzga f24951OooO00o;

    /* renamed from: OooO0O0 */
    public final C1418bd f24952OooO0O0;

    /* renamed from: OooO0OO */
    public final c90 f24953OooO0OO;

    /* renamed from: OooO0Oo */
    public final zzm f24954OooO0Oo;

    /* renamed from: OooO0o */
    public final String f24955OooO0o;

    /* renamed from: OooO0o0 */
    public final zzs f24956OooO0o0;

    /* renamed from: OooO0oO */
    public final ArrayList f24957OooO0oO;

    /* renamed from: OooO0oo */
    public final ArrayList f24958OooO0oo;

    /* renamed from: OooOO0 */
    public final zzy f24959OooOO0;

    /* renamed from: OooOO0O */
    public final int f24960OooOO0O;
    public final AdManagerAdViewOptions OooOO0o;

    /* renamed from: OooOOO */
    public final zzcm f24961OooOOO;

    /* renamed from: OooOOO0 */
    public final PublisherAdViewOptions f24962OooOOO0;

    /* renamed from: OooOOOO */
    public final Oooo0oO.o0000Ooo f24963OooOOOO;

    /* renamed from: OooOOOo */
    public final boolean f24964OooOOOo;

    /* renamed from: OooOOo */
    public final boolean f24965OooOOo;

    /* renamed from: OooOOo0 */
    public final boolean f24966OooOOo0;

    /* renamed from: OooOOoo */
    public final Bundle f24967OooOOoo;

    /* renamed from: OooOo00 */
    public final zzcq f24968OooOo00;

    public /* synthetic */ vd0(ud0 ud0Var) {
        this.f24956OooO0o0 = ud0Var.f24626OooO0O0;
        this.f24955OooO0o = ud0Var.f24627OooO0OO;
        this.f24968OooOo00 = ud0Var.OooOo0;
        zzm zzmVar = ud0Var.f24625OooO00o;
        int i = zzmVar.zza;
        long j = zzmVar.zzb;
        Bundle bundle = zzmVar.zzc;
        int i2 = zzmVar.zzd;
        List list = zzmVar.zze;
        boolean z = zzmVar.zzf;
        int i3 = zzmVar.zzg;
        boolean z2 = true;
        if (!zzmVar.zzh && !ud0Var.f24630OooO0o0) {
            z2 = false;
        }
        boolean z3 = z2;
        String str = zzmVar.zzi;
        zzfx zzfxVar = zzmVar.zzj;
        Location location = zzmVar.zzk;
        String str2 = zzmVar.zzl;
        Bundle bundle2 = zzmVar.zzm;
        Bundle bundle3 = zzmVar.zzn;
        List list2 = zzmVar.zzo;
        String str3 = zzmVar.zzp;
        String str4 = zzmVar.zzq;
        boolean z4 = zzmVar.zzr;
        zzc zzcVar = zzmVar.zzs;
        int i4 = zzmVar.zzt;
        String str5 = zzmVar.zzu;
        List list3 = zzmVar.zzv;
        int iZza = com.google.android.gms.ads.internal.util.zzs.zza(zzmVar.zzw);
        zzm zzmVar2 = ud0Var.f24625OooO00o;
        this.f24954OooO0Oo = new zzm(i, j, bundle, i2, list, z, i3, z3, str, zzfxVar, location, str2, bundle2, bundle3, list2, str3, str4, z4, zzcVar, i4, str5, list3, iZza, zzmVar2.zzx, zzmVar2.zzy, zzmVar2.zzz);
        zzga zzgaVar = ud0Var.f24628OooO0Oo;
        C1414b9 c1414b9 = null;
        if (zzgaVar == null) {
            C1414b9 c1414b92 = ud0Var.f24632OooO0oo;
            zzgaVar = c1414b92 != null ? c1414b92.zzf : null;
        }
        this.f24951OooO00o = zzgaVar;
        ArrayList arrayList = ud0Var.f24629OooO0o;
        this.f24957OooO0oO = arrayList;
        this.f24958OooO0oo = ud0Var.f24631OooO0oO;
        if (arrayList != null && (c1414b9 = ud0Var.f24632OooO0oo) == null) {
            c1414b9 = new C1414b9(new NativeAdOptions.Builder().build());
        }
        this.f24950OooO = c1414b9;
        this.f24959OooOO0 = ud0Var.f24624OooO;
        this.f24960OooOO0O = ud0Var.f24636OooOOO0;
        this.OooOO0o = ud0Var.f24633OooOO0;
        this.f24962OooOOO0 = ud0Var.f24634OooOO0O;
        this.f24961OooOOO = ud0Var.OooOO0o;
        this.f24952OooO0O0 = ud0Var.f24635OooOOO;
        this.f24963OooOOOO = new Oooo0oO.o0000Ooo(ud0Var.f24637OooOOOO);
        this.f24964OooOOOo = ud0Var.f24638OooOOOo;
        this.f24966OooOOo0 = ud0Var.f24640OooOOo0;
        this.f24953OooO0OO = ud0Var.f24639OooOOo;
        this.f24965OooOOo = ud0Var.f24641OooOOoo;
        this.f24967OooOOoo = ud0Var.f24642OooOo00;
    }

    public final InterfaceC2152va OooO00o() {
        AdManagerAdViewOptions adManagerAdViewOptions = this.OooOO0o;
        PublisherAdViewOptions publisherAdViewOptions = this.f24962OooOOO0;
        if (publisherAdViewOptions == null && adManagerAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : adManagerAdViewOptions.zza();
    }
}
