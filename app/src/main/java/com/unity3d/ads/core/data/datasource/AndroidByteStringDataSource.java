package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0o0000;
import o00O0ooo.o0oO0O0o;

/* loaded from: classes3.dex */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore;

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", m13472f = "AndroidByteStringDataSource.kt", m13473l = {18}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2 */
    public static final class C40032 extends OooOOOO implements o00Oo0 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C40032(OooO0OO oooO0OO) {
            super(3, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0O000Oo o0o000oo = (o0O000Oo) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!(th instanceof CorruptionException)) {
                    throw th;
                }
                ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
                ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
                OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
                ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
                ByteString EMPTY = ByteString.EMPTY;
                OooOo.OooO0Oo(EMPTY, "EMPTY");
                dsl_create.setData(EMPTY);
                ByteStringStoreOuterClass.ByteStringStore byteStringStore_build = dsl_create._build();
                this.L$0 = null;
                this.label = 1;
                if (o0o000oo.emit(byteStringStore_build, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return oo00o.OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00Oo0
        public final Object invoke(o0O000Oo o0o000oo, Throwable th, OooO0OO oooO0OO) {
            C40032 c40032 = new C40032(oooO0OO);
            c40032.L$0 = o0o000oo;
            c40032.L$1 = th;
            return c40032.invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", m13472f = "AndroidByteStringDataSource.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2 */
    public static final class C40042 extends OooOOOO implements o00O0O {
        final /* synthetic */ ByteString $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40042(ByteString byteString, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$data = byteString;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40042 c40042 = new C40042(this.$data, oooO0OO);
            c40042.L$0 = obj;
            return c40042;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OooO0OO oooO0OO) {
            return ((C40042) create(byteStringStore, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ((ByteStringStoreOuterClass.ByteStringStore) this.L$0).toBuilder().setData(this.$data).build();
            OooOo.OooO0Oo(byteStringStoreBuild, "currentData.toBuilder()\n…\n                .build()");
            return byteStringStoreBuild;
        }
    }

    public AndroidByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(OooO0OO oooO0OO) {
        return o0o0000.OooOO0o(new o0oO0O0o(this.dataStore.getData(), new C40032(null)), oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, OooO0OO oooO0OO) {
        Object objUpdateData = this.dataStore.updateData(new C40042(byteString, null), oooO0OO);
        return objUpdateData == OooOo00.f31365OooOo0O ? objUpdateData : oo00o.OooOo.f33195OooO00o;
    }
}
