package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ImageView f15853OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15854OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Uri f15855OooOo0o;

    public /* synthetic */ OooO00o(Uri uri, ImageView imageView) {
        this.f15854OooOo0O = 1;
        this.f15855OooOo0o = uri;
        this.f15853OooOo = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15854OooOo0O) {
            case 0:
                ImageViewUtils.m3260b(this.f15853OooOo, this.f15855OooOo0o);
                break;
            case 1:
                ImageViewUtils.m3255a(this.f15855OooOo0o, this.f15853OooOo);
                break;
            default:
                ImageViewUtils.setAndDownscaleBitmap(this.f15853OooOo, this.f15855OooOo0o);
                break;
        }
    }

    public /* synthetic */ OooO00o(ImageView imageView, Uri uri, int i) {
        this.f15854OooOo0O = i;
        this.f15853OooOo = imageView;
        this.f15855OooOo0o = uri;
    }
}
