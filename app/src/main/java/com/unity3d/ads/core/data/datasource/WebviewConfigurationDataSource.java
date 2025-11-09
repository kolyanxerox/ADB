package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
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
public final class WebviewConfigurationDataSource {
    private final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore;

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", m13472f = "WebviewConfigurationDataSource.kt", m13473l = {15}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2 */
    public static final class C40162 extends OooOOOO implements o00Oo0 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C40162(OooO0OO oooO0OO) {
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
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
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
            C40162 c40162 = new C40162(oooO0OO);
            c40162.L$0 = o0o000oo;
            c40162.L$1 = th;
            return c40162.invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", m13472f = "WebviewConfigurationDataSource.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2 */
    public static final class C40172 extends OooOOOO implements o00O0O {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40172(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$data = webViewConfigurationStore;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C40172(this.$data, oooO0OO);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OooO0OO oooO0OO) {
            return ((C40172) create(webViewConfigurationStore, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webviewConfigurationStore) {
        OooOo.OooO0o0(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    public final Object get(OooO0OO oooO0OO) {
        return o0o0000.OooOO0o(new o0oO0O0o(this.webviewConfigurationStore.getData(), new C40162(null)), oooO0OO);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OooO0OO oooO0OO) {
        Object objUpdateData = this.webviewConfigurationStore.updateData(new C40172(webViewConfigurationStore, null), oooO0OO);
        return objUpdateData == OooOo00.f31365OooOo0O ? objUpdateData : oo00o.OooOo.f33195OooO00o;
    }
}
