package o000o00o;

import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import o00O0Oo.OooO0O0;
import o00OO000.OooO0OO;

/* loaded from: classes2.dex */
public final class oo0o0Oo implements o000o0O0.OooOOO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30898OooOo0O;

    public static DataStore OooO0O0(Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        o00O0.oo000o oo000oVar = o00O0.oo000o.f31251OooOo0O;
        try {
            System.loadLibrary("datastore_shared_counter");
            return MultiProcessDataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, oo000oVar, oooO0OO, oooO0O0);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, oo000oVar, oooO0OO, oooO0O0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object OooO00o(o000Oo0O.Oooo0 r9, o00O0OO0.OooO0OO r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o000o00o.o00000OO
            if (r0 == 0) goto L13
            r0 = r10
            o000o00o.o00000OO r0 = (o000o00o.o00000OO) r0
            int r1 = r0.f30750OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30750OooOoO0 = r1
            goto L18
        L13:
            o000o00o.o00000OO r0 = new o000o00o.o00000OO
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f30749OooOo0o
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f30750OooOoO0
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            java.lang.String r6 = ""
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r9 = r0.f30748OooOo0O
            java.lang.String r9 = (java.lang.String) r9
            o00O0.o000OOo.OooOO0O(r10)     // Catch: java.lang.Exception -> L33
            goto L90
        L33:
            r10 = move-exception
            goto L97
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f30748OooOo0O
            o000Oo0O.Oooo0 r9 = (o000Oo0O.Oooo0) r9
            o00O0.o000OOo.OooOO0O(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L73
        L48:
            o00O0.o000OOo.OooOO0O(r10)
            r10 = r9
            o000Oo0O.Oooo000 r10 = (o000Oo0O.Oooo000) r10     // Catch: java.lang.Exception -> L46
            com.google.android.gms.tasks.Task r9 = r10.OooO0o0()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "getToken(...)"
            kotlin.jvm.internal.OooOo.OooO0Oo(r9, r2)     // Catch: java.lang.Exception -> L71
            r0.f30748OooOo0O = r10     // Catch: java.lang.Exception -> L71
            r0.f30750OooOoO0 = r5     // Catch: java.lang.Exception -> L71
            java.lang.Object r9 = o00OoO00.OooOOO0.OooO0OO(r9, r0)     // Catch: java.lang.Exception -> L71
            if (r9 != r1) goto L62
            goto L8f
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            o000Oo0O.OooOOOO r10 = (o000Oo0O.OooOOOO) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.f30365OooO00o     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7a
        L6d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L73
        L71:
            r9 = move-exception
            goto L6d
        L73:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r3, r2, r10)
            r10 = r9
            r9 = r6
        L7a:
            o000Oo0O.Oooo000 r10 = (o000Oo0O.Oooo000) r10     // Catch: java.lang.Exception -> L33
            com.google.android.gms.tasks.Task r10 = r10.OooO0OO()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "getId(...)"
            kotlin.jvm.internal.OooOo.OooO0Oo(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f30748OooOo0O = r9     // Catch: java.lang.Exception -> L33
            r0.f30750OooOoO0 = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = o00OoO00.OooOOO0.OooO0OO(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L90
        L8f:
            return r1
        L90:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            if (r10 != 0) goto L95
            goto L9c
        L95:
            r6 = r10
            goto L9c
        L97:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r3, r0, r10)
        L9c:
            o000o00o.o0000Ooo r10 = new o000o00o.o0000Ooo
            r10.<init>(r6, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.oo0o0Oo.OooO00o(o000Oo0O.Oooo0, o00O0OO0.OooO0OO):java.lang.Object");
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        switch (this.f30898OooOo0O) {
            case 1:
                return oo0o0O0.f30897OooO00o;
            default:
                return o00O0OO.f30859OooO00o;
        }
    }
}
