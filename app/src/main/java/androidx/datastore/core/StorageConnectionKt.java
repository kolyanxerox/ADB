package androidx.datastore.core;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class StorageConnectionKt {

    @OooO(m13471c = "androidx.datastore.core.StorageConnectionKt$readData$2", m13472f = "StorageConnection.kt", m13473l = {74}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.StorageConnectionKt$readData$2 */
    public static final class C03262 extends OooOOOO implements o00Oo0 {
        private /* synthetic */ Object L$0;
        int label;

        public C03262(OooO0OO oooO0OO) {
            super(3, oooO0OO);
        }

        public final Object invoke(ReadScope<T> readScope, boolean z, OooO0OO oooO0OO) {
            C03262 c03262 = new C03262(oooO0OO);
            c03262.L$0 = readScope;
            return c03262.invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == oooOo00 ? oooOo00 : data;
        }

        @Override // o00O0Oo.o00Oo0
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (OooO0OO) obj3);
        }
    }

    @OooO(m13471c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m13472f = "StorageConnection.kt", m13473l = {77}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2 */
    public static final class C03272 extends OooOOOO implements o00O0O {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03272(T t, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$value = t;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C03272 c03272 = new C03272(this.$value, oooO0OO);
            c03272.L$0 = obj;
            return c03272;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(WriteScope<T> writeScope, OooO0OO oooO0OO) {
            return ((C03272) create(writeScope, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t = this.$value;
                this.label = 1;
                if (writeScope.writeData(t, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }
    }

    public static final <T> Object readData(StorageConnection<T> storageConnection, OooO0OO oooO0OO) {
        return storageConnection.readScope(new C03262(null), oooO0OO);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t, OooO0OO oooO0OO) {
        Object objWriteScope = storageConnection.writeScope(new C03272(t, null), oooO0OO);
        return objWriteScope == OooOo00.f31365OooOo0O ? objWriteScope : OooOo.f33195OooO00o;
    }
}
