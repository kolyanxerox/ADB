package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pf */
/* loaded from: classes2.dex */
public final class BinderC1935pf extends AbstractBinderC1603gf {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final NativeAdMapper f23329OooOo0O;

    public BinderC1935pf(NativeAdMapper nativeAdMapper) {
        this.f23329OooOo0O = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void Oooo0(Oooo0o.OooO0O0 oooO0O0) {
        this.f23329OooOo0O.untrackView((View) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void o000000O(Oooo0o.OooO0O0 oooO0O0, Oooo0o.OooO0O0 oooO0O02, Oooo0o.OooO0O0 oooO0O03) {
        HashMap map = (HashMap) Oooo0o.OooO0OO.o000O0oO(oooO0O02);
        HashMap map2 = (HashMap) Oooo0o.OooO0OO.o000O0oO(oooO0O03);
        this.f23329OooOo0O.trackViews((View) Oooo0o.OooO0OO.o000O0oO(oooO0O0), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void o000O0O(Oooo0o.OooO0O0 oooO0O0) {
        this.f23329OooOo0O.handleClick((View) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final boolean zzA() {
        return this.f23329OooOo0O.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final boolean zzB() {
        return this.f23329OooOo0O.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final double zze() {
        NativeAdMapper nativeAdMapper = this.f23329OooOo0O;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final float zzf() {
        return this.f23329OooOo0O.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final float zzg() {
        return this.f23329OooOo0O.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final float zzh() {
        return this.f23329OooOo0O.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Bundle zzi() {
        return this.f23329OooOo0O.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final zzeb zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final InterfaceC1523e9 zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final InterfaceC1707j9 zzl() {
        NativeAd.Image icon = this.f23329OooOo0O.getIcon();
        if (icon != null) {
            return new BinderC2298z8(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Oooo0o.OooO0O0 zzm() {
        View adChoicesContent = this.f23329OooOo0O.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new Oooo0o.OooO0OO(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Oooo0o.OooO0O0 zzn() {
        View viewZza = this.f23329OooOo0O.zza();
        if (viewZza == null) {
            return null;
        }
        return new Oooo0o.OooO0OO(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final Oooo0o.OooO0O0 zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzp() {
        return this.f23329OooOo0O.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzq() {
        return this.f23329OooOo0O.getBody();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzr() {
        return this.f23329OooOo0O.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzs() {
        return this.f23329OooOo0O.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzt() {
        return this.f23329OooOo0O.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final String zzu() {
        return this.f23329OooOo0O.getStore();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final List zzv() {
        List<NativeAd.Image> images = this.f23329OooOo0O.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new BinderC2298z8(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1640hf
    public final void zzx() {
        this.f23329OooOo0O.recordImpression();
    }
}
