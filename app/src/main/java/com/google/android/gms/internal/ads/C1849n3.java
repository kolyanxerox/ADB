package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzbe;

/* renamed from: com.google.android.gms.internal.ads.n3 */
/* loaded from: classes2.dex */
public final class C1849n3 extends Thread {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f21393OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f21394OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f21395OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final int f21396OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final oOo0o00 f21397OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final int f21398OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final int f21399OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final int f21400OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final int f21401OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public final int f21402OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final boolean f21403Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final int f21404Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final int f21405Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final String f21406Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final boolean f21407Oooo0O0;

    public C1849n3() {
        oOo0o00 ooo0o00 = new oOo0o00(4, (byte) 0);
        this.f21394OooOo0O = false;
        this.f21395OooOo0o = false;
        this.f21397OooOoO0 = ooo0o00;
        this.f21393OooOo = new Object();
        this.f21398OooOoOO = ((Long) AbstractC1376a8.f16969OooO0Oo.OooOOO()).intValue();
        this.f21400OooOoo0 = ((Long) AbstractC1376a8.f16966OooO00o.OooOOO()).intValue();
        this.f21399OooOoo = ((Long) AbstractC1376a8.f16971OooO0o0.OooOOO()).intValue();
        this.f21401OooOooO = ((Long) AbstractC1376a8.f16968OooO0OO.OooOOO()).intValue();
        this.f21402OooOooo = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17762OooooOO)).intValue();
        this.f21404Oooo000 = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17763OooooOo)).intValue();
        this.f21405Oooo00O = ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.f17765Oooooo0)).intValue();
        this.f21396OooOoO = ((Long) AbstractC1376a8.f16970OooO0o.OooOOO()).intValue();
        this.f21406Oooo00o = (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17766OoooooO);
        this.f21403Oooo0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17767Ooooooo)).booleanValue();
        this.f21407Oooo0O0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17931o0OoOo0)).booleanValue();
        ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17941ooOO)).getClass();
        setName("ContentFetchTask");
    }

    public final o0O0ooO OooO00o(View view, C1665i3 c1665i3) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    c1665i3.OooO0OO(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new o0O0ooO(1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof InterfaceC1722jo)) {
                    WebView webView = (WebView) view;
                    synchronized (c1665i3.f19908OooO0oO) {
                        c1665i3.f19913OooOOO0++;
                    }
                    webView.post(new o000oOoO(this, c1665i3, webView, globalVisibleRect));
                    return new o0O0ooO(0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i = 0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        o0O0ooO o0o0oooOooO00o = OooO00o(viewGroup.getChildAt(i3), c1665i3);
                        i += o0o0oooOooO00o.f22022OooO00o;
                        i2 += o0o0oooOooO00o.f22023OooO0O0;
                    }
                    return new o0O0ooO(i, i2);
                }
            }
        }
        return new o0O0ooO(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r5.importance != 100) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r4.inKeyguardRestrictedInputMode() != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        r1 = (android.os.PowerManager) r1.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r1 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r1.isScreenOn() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r1 = com.google.android.gms.ads.internal.zzv.zzb().OooO00o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r1 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: no activity. Sleeping.");
        r1 = r8.f21393OooOo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        r8.f21395OooOo0o = true;
        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
    
        if (r1.getWindow() == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0096, code lost:
    
        if (r1.getWindow().getDecorView() == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
    
        r3 = r1.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("ContentFetchTask.extractContent", r0);
        com.google.android.gms.ads.internal.util.client.zzo.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ee, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fd, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2 A[Catch: Exception -> 0x0083, InterruptedException -> 0x0085, TryCatch #9 {InterruptedException -> 0x0085, Exception -> 0x0083, blocks: (B:32:0x0065, B:34:0x006f, B:35:0x0076, B:67:0x00e2, B:41:0x0082, B:55:0x00b9, B:53:0x00a9, B:63:0x00d2, B:64:0x00d9, B:71:0x00ed, B:62:0x00c9), top: B:101:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105 A[EXC_TOP_SPLITTER, LOOP:2: B:91:0x0105->B:107:0x0105, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1849n3.run():void");
    }
}
