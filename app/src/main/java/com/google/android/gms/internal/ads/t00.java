package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class t00 {

    /* renamed from: OooO, reason: collision with root package name */
    public final boolean f24214OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final k50 f24215OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final m60 f24216OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC2251xz f24217OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArraySet f24218OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final ArrayDeque f24219OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayDeque f24220OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final Object f24221OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f24222OooO0oo;

    public t00(Looper looper, k50 k50Var, InterfaceC2251xz interfaceC2251xz) {
        this(new CopyOnWriteArraySet(), looper, k50Var, interfaceC2251xz, true);
    }

    public final void OooO00o(Object obj) {
        synchronized (this.f24221OooO0oO) {
            try {
                if (this.f24222OooO0oo) {
                    return;
                }
                this.f24218OooO0Oo.add(new e00(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0() {
        OooO0o0();
        ArrayDeque arrayDeque = this.f24219OooO0o;
        if (arrayDeque.isEmpty()) {
            return;
        }
        m60 m60Var = this.f24216OooO0O0;
        if (!m60Var.f21095OooO00o.hasMessages(1)) {
            m60Var.getClass();
            q50 q50VarOooO0o0 = m60.OooO0o0();
            Handler handler = m60Var.f21095OooO00o;
            Message messageObtainMessage = handler.obtainMessage(1);
            q50VarOooO0o0.f23511OooO00o = messageObtainMessage;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            q50VarOooO0o0.f23511OooO00o = null;
            m60.OooO0Oo(q50VarOooO0o0);
        }
        ArrayDeque arrayDeque2 = this.f24220OooO0o0;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void OooO0OO(int i, InterfaceC1770kz interfaceC1770kz) {
        OooO0o0();
        this.f24219OooO0o.add(new RunnableC2324zy(i, new CopyOnWriteArraySet(this.f24218OooO0Oo), 0, interfaceC1770kz));
    }

    public final void OooO0Oo() {
        OooO0o0();
        synchronized (this.f24221OooO0oO) {
            this.f24222OooO0oo = true;
        }
        Iterator it = this.f24218OooO0Oo.iterator();
        while (it.hasNext()) {
            e00 e00Var = (e00) it.next();
            InterfaceC2251xz interfaceC2251xz = this.f24217OooO0OO;
            e00Var.f18444OooO0Oo = true;
            if (e00Var.f18443OooO0OO) {
                e00Var.f18443OooO0OO = false;
                interfaceC2251xz.OooO0oO(e00Var.f18441OooO00o, e00Var.f18442OooO0O0.OooO0oo());
            }
        }
        this.f24218OooO0Oo.clear();
    }

    public final void OooO0o0() {
        if (this.f24214OooO) {
            af0.OooooO0(Thread.currentThread() == this.f24216OooO0O0.f21095OooO00o.getLooper().getThread());
        }
    }

    public t00(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, k50 k50Var, InterfaceC2251xz interfaceC2251xz, boolean z) {
        this.f24215OooO00o = k50Var;
        this.f24218OooO0Oo = copyOnWriteArraySet;
        this.f24217OooO0OO = interfaceC2251xz;
        this.f24221OooO0oO = new Object();
        this.f24220OooO0o0 = new ArrayDeque();
        this.f24219OooO0o = new ArrayDeque();
        this.f24216OooO0O0 = k50Var.OooO00o(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.ny
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                t00 t00Var = this.f21615OooOo0O;
                Iterator it = t00Var.f24218OooO0Oo.iterator();
                while (it.hasNext()) {
                    e00 e00Var = (e00) it.next();
                    if (!e00Var.f18444OooO0Oo && e00Var.f18443OooO0OO) {
                        ka1 ka1VarOooO0oo = e00Var.f18442OooO0O0.OooO0oo();
                        e00Var.f18442OooO0O0 = new OooO0oO.Oooo000();
                        e00Var.f18443OooO0OO = false;
                        t00Var.f24217OooO0OO.OooO0oO(e00Var.f18441OooO00o, ka1VarOooO0oo);
                    }
                    if (t00Var.f24216OooO0O0.f21095OooO00o.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f24214OooO = z;
    }
}
