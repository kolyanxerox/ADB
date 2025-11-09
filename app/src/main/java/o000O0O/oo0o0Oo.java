package o000o0O;

import androidx.datastore.core.DataStore;
import java.util.concurrent.atomic.AtomicReference;
import o000o00o.oo0o0O0;
import o00O0oOo.o0000OO0;

/* loaded from: classes2.dex */
public final class oo0o0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0O0 f30947OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final DataStore f30948OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicReference f30949OooO0OO;

    public oo0o0Oo(o00O0O0O.OooOOO0 backgroundDispatcher, oo0o0O0 timeProvider, DataStore sessionConfigsDataStore) {
        kotlin.jvm.internal.OooOo.OooO0o0(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(timeProvider, "timeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f30947OooO00o = timeProvider;
        this.f30948OooO0O0 = sessionConfigsDataStore;
        this.f30949OooO0OO = new AtomicReference();
        o0000OO0.OooOo0(o0000OO0.OooO0O0(backgroundDispatcher), null, new o0ooOOo(this, null), 3);
    }

    public final o00O0O OooO00o() throws Throwable {
        AtomicReference atomicReference = this.f30949OooO0OO;
        if (atomicReference.get() == null) {
            Object objOooOoO = o0000OO0.OooOoO(o00O0O0O.OooOOO.f31358OooOo0O, new o0OOO0o(this, null));
            while (!atomicReference.compareAndSet(null, objOooOoO) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.OooOo.OooO0Oo(obj, "get(...)");
        return (o00O0O) obj;
    }

    public final boolean OooO0O0() throws Throwable {
        Integer num;
        o00O0O o00o0oOooO00o = OooO00o();
        o00O0O o00o0oOooO00o2 = OooO00o();
        Long l = o00o0oOooO00o.f30929OooO0o0;
        if (l == null || (num = o00o0oOooO00o2.f30928OooO0Oo) == null) {
            return true;
        }
        return this.f30947OooO00o.OooO00o().f30862OooO0OO - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0OO(o000o0O.o00O0O r6, o00O0OO0.OooO0OO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o000o0O.o0Oo0oo
            if (r0 == 0) goto L13
            r0 = r7
            o000o0O.o0Oo0oo r0 = (o000o0O.o0Oo0oo) r0
            int r1 = r0.f30940OooOo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30940OooOo = r1
            goto L18
        L13:
            o000o0O.o0Oo0oo r0 = new o000o0O.o0Oo0oo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f30941OooOo0O
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f30940OooOo
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            o00O0.o000OOo.OooOO0O(r7)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            o00O0.o000OOo.OooOO0O(r7)
            androidx.datastore.core.DataStore r7 = r5.f30948OooO0O0     // Catch: java.io.IOException -> L27
            o000o0O.o0OO00O r2 = new o000o0O.o0OO00O     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L27
            r0.f30940OooOo = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r7.updateData(r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L58:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o0O.oo0o0Oo.OooO0OO(o000o0O.o00O0O, o00O0OO0.OooO0OO):java.lang.Object");
    }
}
