package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
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
public final class UniversalRequestDataSource {
    private final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore;

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", m13472f = "UniversalRequestDataSource.kt", m13473l = {16}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2 */
    public static final class C40132 extends OooOOOO implements o00Oo0 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C40132(OooO0OO oooO0OO) {
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
                UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
                OooOo.OooO0Oo(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (o0o000oo.emit(defaultInstance, this) == oooOo00) {
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
            C40132 c40132 = new C40132(oooO0OO);
            c40132.L$0 = o0o000oo;
            c40132.L$1 = th;
            return c40132.invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", m13472f = "UniversalRequestDataSource.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2 */
    public static final class C40142 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40142(String str, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40142 c40142 = new C40142(this.$key, oooO0OO);
            c40142.L$0 = obj;
            return c40142;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OooO0OO oooO0OO) {
            return ((C40142) create(universalRequestStore, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.removeUniversalRequestMap(this.$key);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            OooOo.OooO0Oo(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2", m13472f = "UniversalRequestDataSource.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$set$2 */
    public static final class C40152 extends OooOOOO implements o00O0O {
        final /* synthetic */ ByteString $data;
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40152(String str, ByteString byteString, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.$data = byteString;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C40152 c40152 = new C40152(this.$key, this.$data, oooO0OO);
            c40152.L$0 = obj;
            return c40152;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OooO0OO oooO0OO) {
            return ((C40152) create(universalRequestStore, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = ((UniversalRequestStoreOuterClass.UniversalRequestStore) this.L$0).toBuilder();
            builder.putUniversalRequestMap(this.$key, this.$data);
            UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStoreBuild = builder.build();
            OooOo.OooO0Oo(universalRequestStoreBuild, "dataBuilder.build()");
            return universalRequestStoreBuild;
        }
    }

    public UniversalRequestDataSource(DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestStore) {
        OooOo.OooO0o0(universalRequestStore, "universalRequestStore");
        this.universalRequestStore = universalRequestStore;
    }

    public final Object get(OooO0OO oooO0OO) {
        return o0o0000.OooOO0o(new o0oO0O0o(this.universalRequestStore.getData(), new C40132(null)), oooO0OO);
    }

    public final Object remove(String str, OooO0OO oooO0OO) {
        Object objUpdateData = this.universalRequestStore.updateData(new C40142(str, null), oooO0OO);
        return objUpdateData == OooOo00.f31365OooOo0O ? objUpdateData : oo00o.OooOo.f33195OooO00o;
    }

    public final Object set(String str, ByteString byteString, OooO0OO oooO0OO) {
        Object objUpdateData = this.universalRequestStore.updateData(new C40152(str, byteString, null), oooO0OO);
        return objUpdateData == OooOo00.f31365OooOo0O ? objUpdateData : oo00o.OooOo.f33195OooO00o;
    }
}
