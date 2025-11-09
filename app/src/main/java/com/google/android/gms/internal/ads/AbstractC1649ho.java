package com.google.android.gms.internal.ads;

import android.webkit.ConsoleMessage;

/* renamed from: com.google.android.gms.internal.ads.ho */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1649ho {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f19833OooO00o;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f19833OooO00o = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19833OooO00o[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19833OooO00o[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f19833OooO00o[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f19833OooO00o[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
