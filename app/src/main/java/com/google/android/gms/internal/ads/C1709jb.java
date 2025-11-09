package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jb */
/* loaded from: classes2.dex */
public final class C1709jb implements InterfaceC2042sb {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20238OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f20239OooOo0o;

    public /* synthetic */ C1709jb(Object obj, int i) {
        this.f20238OooOo0O = i;
        this.f20239OooOo0o = obj;
    }

    private final /* bridge */ /* synthetic */ void OooO00o(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (((ViewTreeObserverOnGlobalLayoutListenerC2166vo) this.f20239OooOo0o)) {
                    try {
                        ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = (ViewTreeObserverOnGlobalLayoutListenerC2166vo) this.f20239OooOo0o;
                        if (viewTreeObserverOnGlobalLayoutListenerC2166vo.f25058Ooooo0o != i) {
                            viewTreeObserverOnGlobalLayoutListenerC2166vo.f25058Ooooo0o = i;
                            viewTreeObserverOnGlobalLayoutListenerC2166vo.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                zzo.zzk("Exception occurred while getting webview content height", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ba  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(java.lang.Object r9, java.util.Map r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1709jb.OooO0o0(java.lang.Object, java.util.Map):void");
    }
}
