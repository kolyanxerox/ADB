package androidx.datastore.core;

import com.ironsource.InterfaceC3173h3;
import java.io.File;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

/* loaded from: classes.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    @OooO(m13471c = "androidx.datastore.core.FileWriteScope", m13472f = "FileStorage.kt", m13473l = {InterfaceC3173h3.c.b.f8810b}, m13474m = "writeData")
    /* renamed from: androidx.datastore.core.FileWriteScope$writeData$1 */
    public static final class C03111 extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03111(FileWriteScope<T> fileWriteScope, o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.this$0 = fileWriteScope;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        OooOo.OooO0o0(file, "file");
        OooOo.OooO0o0(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object writeData(T r6, o00O0O0O.OooO0OO r7) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.FileWriteScope.C03111
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = (androidx.datastore.core.FileWriteScope.C03111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = new androidx.datastore.core.FileWriteScope$writeData$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            o00O0.o000OOo.OooOO0O(r7)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r6 = move-exception
            goto L70
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            o00O0.o000OOo.OooOO0O(r7)
            r5.checkNotClosed()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.getFile()
            r7.<init>(r2)
            androidx.datastore.core.Serializer r2 = r5.getSerializer()     // Catch: java.lang.Throwable -> L6e
            androidx.datastore.core.UncloseableOutputStream r4 = new androidx.datastore.core.UncloseableOutputStream     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6e
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L6e
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L6e
            r0.label = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L6e
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r6 = r7
            r0 = r6
        L60:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L2f
            r6.sync()     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            com.google.android.gms.internal.measurement.o0OO0O0.OooOO0(r0, r6)
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        L6e:
            r6 = move-exception
            r0 = r7
        L70:
            throw r6     // Catch: java.lang.Throwable -> L71
        L71:
            r7 = move-exception
            com.google.android.gms.internal.measurement.o0OO0O0.OooOO0(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileWriteScope.writeData(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
