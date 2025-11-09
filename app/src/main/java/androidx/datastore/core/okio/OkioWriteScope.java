package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00OOOoO.o0000O;
import o00OOOoO.o000O0Oo;

/* loaded from: classes.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    @OooO(m13471c = "androidx.datastore.core.okio.OkioWriteScope", m13472f = "OkioStorage.kt", m13473l = {216}, m13474m = "writeData")
    /* renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1 */
    public static final class C03331 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03331(OkioWriteScope<T> okioWriteScope, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = okioWriteScope;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(o0000O fileSystem, o000O0Oo path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        OooOo.OooO0o0(fileSystem, "fileSystem");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[Catch: all -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ab, blocks: (B:44:0x009f, B:52:0x00ad, B:19:0x005a), top: B:77:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad A[Catch: all -> 0x00ab, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ab, blocks: (B:44:0x009f, B:52:0x00ad, B:19:0x005a), top: B:77:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeData(T r9, o00O0O0O.OooO0OO r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.writeData(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
