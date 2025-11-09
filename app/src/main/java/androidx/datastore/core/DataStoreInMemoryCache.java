package androidx.datastore.core;

import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;

/* loaded from: classes.dex */
public final class DataStoreInMemoryCache<T> {
    private final o0OO cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        OooOo.OooO0OO(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = o0o0000.OooO0OO(unInitialized);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public final State<T> getCurrentState() {
        return (State) ((oO00000o) this.cachedValue).getValue();
    }

    public final o0OoOoOo getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.core.State<T> tryUpdate(androidx.datastore.core.State<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.OooOo.OooO0o0(r7, r0)
            o00O0ooo.o0OO r0 = r6.cachedValue
        L7:
            r1 = r0
            o00O0ooo.oO00000o r1 = (o00O0ooo.oO00000o) r1
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            androidx.datastore.core.State r3 = (androidx.datastore.core.State) r3
            boolean r4 = r3 instanceof androidx.datastore.core.ReadException
            if (r4 == 0) goto L17
            r4 = 1
            goto L1d
        L17:
            androidx.datastore.core.UnInitialized r4 = androidx.datastore.core.UnInitialized.INSTANCE
            boolean r4 = kotlin.jvm.internal.OooOo.OooO00o(r3, r4)
        L1d:
            if (r4 == 0) goto L20
            goto L2e
        L20:
            boolean r4 = r3 instanceof androidx.datastore.core.Data
            if (r4 == 0) goto L30
            int r4 = r7.getVersion()
            int r5 = r3.getVersion()
            if (r4 <= r5) goto L34
        L2e:
            r3 = r7
            goto L34
        L30:
            boolean r4 = r3 instanceof androidx.datastore.core.Final
            if (r4 == 0) goto L3b
        L34:
            boolean r1 = r1.OooO0oO(r2, r3)
            if (r1 == 0) goto L7
            return r3
        L3b:
            OooOOO0.OooO00o r7 = new OooOOO0.OooO00o
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreInMemoryCache.tryUpdate(androidx.datastore.core.State):androidx.datastore.core.State");
    }
}
