package o00OO0O0;

import io.flutter.plugins.webviewflutter.o00000;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o00O0oOo.o0OO00O;
import o00O0oOo.oo0o0Oo;
import o00OO000.o00Ooo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public class OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O f32038OooO00o;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32033OooO0O0 = AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, Object.class, "head$volatile");

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32034OooO0OO = AtomicLongFieldUpdater.newUpdater(OooOOO0.class, "deqIdx$volatile");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32035OooO0Oo = AtomicReferenceFieldUpdater.newUpdater(OooOOO0.class, Object.class, "tail$volatile");

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32037OooO0o0 = AtomicLongFieldUpdater.newUpdater(OooOOO0.class, "enqIdx$volatile");

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32036OooO0o = AtomicIntegerFieldUpdater.newUpdater(OooOOO0.class, "_availablePermits$volatile");

    public OooOOO0(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        OooOOOO oooOOOO = new OooOOOO(0L, null, 2);
        this.head$volatile = oooOOOO;
        this.tail$volatile = oooOOOO;
        this._availablePermits$volatile = 1 - i;
        this.f32038OooO00o = new o0OO00O(this, 1);
    }

    public final void OooO00o(OooO0OO oooO0OO) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objOooO0O0;
        oo0o0Oo oo0o0oo;
        while (true) {
            int andDecrement = f32036OooO0o.getAndDecrement(this);
            if (andDecrement <= 1) {
                OooOo oooOo = OooOo.f33195OooO00o;
                oo0o0Oo oo0o0oo2 = oooO0OO.f32022OooOo0O;
                OooO0o oooO0o = oooO0OO.f32023OooOo0o;
                if (andDecrement > 0) {
                    OooO0o.f32024OooO0oO.set(oooO0o, null);
                    oo0o0oo2.OooOoOO(oooOo, oo0o0oo2.f31515OooOo, new o0OO00O(new o00000(2, oooO0o, oooO0OO), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32035OooO0Oo;
                OooOOOO oooOOOO = (OooOOOO) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f32037OooO0o0.getAndIncrement(this);
                OooOO0 oooOO0 = OooOO0.f32025OooOo0O;
                long j = andIncrement / OooOOO.f32031OooO0o;
                while (true) {
                    objOooO0O0 = o00OO000.OooO00o.OooO0O0(oooOOOO, j, oooOO0);
                    if (!o00OO000.OooO00o.OooO0o0(objOooO0O0)) {
                        o00Ooo o00oooOooO0OO = o00OO000.OooO00o.OooO0OO(objOooO0O0);
                        while (true) {
                            o00Ooo o00ooo2 = (o00Ooo) atomicReferenceFieldUpdater.get(this);
                            oo0o0oo = oo0o0oo2;
                            if (o00ooo2.f31964OooOo >= o00oooOooO0OO.f31964OooOo) {
                                break;
                            }
                            if (!o00oooOooO0OO.OooOO0()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, o00ooo2, o00oooOooO0OO)) {
                                if (atomicReferenceFieldUpdater.get(this) != o00ooo2) {
                                    if (o00oooOooO0OO.OooO0o()) {
                                        o00oooOooO0OO.OooO0o0();
                                    }
                                    oo0o0oo2 = oo0o0oo;
                                }
                            }
                            if (o00ooo2.OooO0o()) {
                                o00ooo2.OooO0o0();
                            }
                        }
                    } else {
                        oo0o0oo = oo0o0oo2;
                        break;
                    }
                    oo0o0oo2 = oo0o0oo;
                }
                OooOOOO oooOOOO2 = (OooOOOO) o00OO000.OooO00o.OooO0OO(objOooO0O0);
                int i = (int) (andIncrement % OooOOO.f32031OooO0o);
                AtomicReferenceArray atomicReferenceArray = oooOOOO2.f32039OooOoO;
                while (!atomicReferenceArray.compareAndSet(i, null, oooO0OO)) {
                    if (atomicReferenceArray.get(i) != null) {
                        o000O0O0.OooO0O0 oooO0O0 = OooOOO.f32028OooO0O0;
                        o000O0O0.OooO0O0 oooO0O02 = OooOOO.f32029OooO0OO;
                        while (!atomicReferenceArray.compareAndSet(i, oooO0O0, oooO0O02)) {
                            oo0o0Oo oo0o0oo3 = oo0o0oo;
                            if (atomicReferenceArray.get(i) != oooO0O0) {
                                break;
                            } else {
                                oo0o0oo = oo0o0oo3;
                            }
                        }
                        OooO0o.f32024OooO0oO.set(oooO0o, null);
                        oo0o0Oo oo0o0oo4 = oo0o0oo;
                        oo0o0oo4.OooOoOO(oooOo, oo0o0oo4.f31515OooOo, new o0OO00O(new o00000(2, oooO0o, oooO0OO), 0));
                        return;
                    }
                }
                oooO0OO.OooO0O0(oooOOOO2, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO0O0.OooOOO0.OooO0O0():void");
    }
}
