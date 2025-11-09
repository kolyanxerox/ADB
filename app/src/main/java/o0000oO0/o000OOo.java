package o0000oo0;

import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o0000o0.OooOOO;
import o0000oO0.o00O0O;
import o0000oO0.o0OoOo0;
import o0000ooO.o0O0OOO0;
import o000OOo0.OooO00o;
import o000OOo0.OooO0O0;
import o000OOo0.OooO0OO;

/* loaded from: classes2.dex */
public final class o000OOo implements OooO0OO, OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f29668OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public ArrayDeque f29669OooO0O0;

    public o000OOo() {
        o0O0OOO0 o0o0ooo0 = o0O0OOO0.f29724OooOo0O;
        this.f29668OooO00o = new HashMap();
        this.f29669OooO0O0 = new ArrayDeque();
    }

    @Override // o000OOo0.OooO0O0
    public final void OooO00o(OooO00o oooO00o) {
        Set<Map.Entry> setEntrySet;
        oooO00o.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f29669OooO0O0;
                if (arrayDeque != null) {
                    arrayDeque.add(oooO00o);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.f29668OooO00o.get(OooOOO.class);
                        setEntrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } finally {
                    }
                }
                for (Map.Entry entry : setEntrySet) {
                    ((Executor) entry.getValue()).execute(new OooOOOO(3, entry, oooO00o));
                }
            } finally {
            }
        }
    }

    public final synchronized void OooO0O0() {
        o00O0O o00o0o = o00O0O.f29642OooOo0O;
        o0OoOo0 o0oooo0 = o0OoOo0.f29643OooO00o;
        synchronized (this) {
            try {
                if (!this.f29668OooO00o.containsKey(OooOOO.class)) {
                    this.f29668OooO00o.put(OooOOO.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f29668OooO00o.get(OooOOO.class)).put(o0oooo0, o00o0o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
