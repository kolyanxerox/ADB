package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.a */
/* loaded from: classes2.dex */
public class C2625a extends Thread {

    /* renamed from: l */
    private static final int f3843l = 1;

    /* renamed from: m */
    private static final InterfaceC2954b f3844m = new a();

    /* renamed from: n */
    private static final InterfaceC3154gj f3845n = new b();

    /* renamed from: d */
    private final int f3849d;

    /* renamed from: a */
    private InterfaceC2954b f3846a = f3844m;

    /* renamed from: b */
    private InterfaceC3154gj f3847b = f3845n;

    /* renamed from: c */
    private final Handler f3848c = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private String f3850e = "";

    /* renamed from: f */
    private boolean f3851f = false;

    /* renamed from: g */
    private boolean f3852g = false;

    /* renamed from: h */
    private volatile int f3853h = 0;

    /* renamed from: i */
    private int f3854i = 1;

    /* renamed from: j */
    private int f3855j = 0;

    /* renamed from: k */
    private final Runnable f3856k = new c();

    /* renamed from: com.ironsource.a$a */
    public class a implements InterfaceC2954b {
        @Override // com.ironsource.InterfaceC2954b
        /* renamed from: a */
        public void mo4734a() {
        }

        @Override // com.ironsource.InterfaceC2954b
        /* renamed from: b */
        public void mo4735b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.a$b */
    public class b implements InterfaceC3154gj {
        @Override // com.ironsource.InterfaceC3154gj
        /* renamed from: a */
        public void mo4736a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2625a c2625a = C2625a.this;
            c2625a.f3853h = (c2625a.f3853h + 1) % Integer.MAX_VALUE;
        }
    }

    public C2625a(int i) {
        this.f3849d = i;
    }

    /* renamed from: a */
    public int m4725a() {
        return this.f3855j;
    }

    /* renamed from: b */
    public int m4731b() {
        return this.f3854i;
    }

    /* renamed from: c */
    public C2625a m4733c() {
        this.f3850e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.f3855j < this.f3854i) {
            int i2 = this.f3853h;
            this.f3848c.post(this.f3856k);
            try {
                Thread.sleep(this.f3849d);
                if (this.f3853h != i2) {
                    this.f3855j = 0;
                } else if (this.f3852g || !Debug.isDebuggerConnected()) {
                    this.f3855j++;
                    this.f3846a.mo4734a();
                    String str = C3551q9.f10896l;
                    if (str != null && !str.trim().isEmpty()) {
                        new C3360mc(C3551q9.f10896l, String.valueOf(System.currentTimeMillis()), "ANR").m10019a();
                    }
                } else {
                    if (this.f3853h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.f3853h;
                }
            } catch (InterruptedException e) {
                this.f3847b.mo4736a(e);
                return;
            }
        }
        if (this.f3855j >= this.f3854i) {
            this.f3846a.mo4735b();
        }
    }

    /* renamed from: b */
    public C2625a m4732b(boolean z) {
        this.f3851f = z;
        return this;
    }

    /* renamed from: a */
    public C2625a m4726a(InterfaceC2954b interfaceC2954b) {
        if (interfaceC2954b == null) {
            this.f3846a = f3844m;
            return this;
        }
        this.f3846a = interfaceC2954b;
        return this;
    }

    /* renamed from: a */
    public C2625a m4727a(InterfaceC3154gj interfaceC3154gj) {
        if (interfaceC3154gj == null) {
            this.f3847b = f3845n;
            return this;
        }
        this.f3847b = interfaceC3154gj;
        return this;
    }

    /* renamed from: a */
    public C2625a m4728a(String str) {
        if (str == null) {
            str = "";
        }
        this.f3850e = str;
        return this;
    }

    /* renamed from: a */
    public C2625a m4729a(boolean z) {
        this.f3852g = z;
        return this;
    }

    /* renamed from: a */
    private String m4724a(StackTraceElement[] stackTraceElementArr) {
        String string = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(string);
                    sbOooOo0O.append(stackTraceElement.toString());
                    sbOooOo0O.append(";\n");
                    string = sbOooOo0O.toString();
                }
            }
        }
        return string;
    }

    /* renamed from: a */
    public void m4730a(int i) {
        this.f3854i = i;
    }
}
