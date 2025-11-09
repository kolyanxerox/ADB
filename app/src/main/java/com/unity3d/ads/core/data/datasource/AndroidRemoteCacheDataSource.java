package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo0.oo000o;
import o00O0oO.o0OO00O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidRemoteCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final HttpClient httpClient;
    private final o0000O00 ioDispatcher;

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", m13472f = "AndroidRemoteCacheDataSource.kt", m13473l = {57, 65}, m13474m = "getFile")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$1 */
    public static final class C40091 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C40091(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRemoteCacheDataSource.this.getFile(null, null, null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2", m13472f = "AndroidRemoteCacheDataSource.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$saveToCache$2 */
    public static final class C40102 extends OooOOOO implements o00O0O {
        final /* synthetic */ Object $body;
        final /* synthetic */ File $dest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40102(Object obj, File file, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$body = obj;
            this.$dest = file;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return new C40102(this.$body, this.$dest, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            FileOutputStream fileOutputStream;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            Object obj2 = this.$body;
            if (obj2 instanceof File) {
                oo000o.OooOO0o((File) obj2, this.$dest);
                return Boolean.valueOf(((File) this.$body).delete());
            }
            boolean z = obj2 instanceof byte[];
            OooOo oooOo = OooOo.f33195OooO00o;
            if (!z) {
                if (!(obj2 instanceof String)) {
                    StringBuilder sb = new StringBuilder("Unknown body type ");
                    Object obj3 = this.$body;
                    sb.append(obj3 != null ? obj3.getClass().getSimpleName() : null);
                    throw new IllegalStateException(sb.toString().toString());
                }
                this.$dest.createNewFile();
                File file = this.$dest;
                String text = (String) this.$body;
                Charset charset = o0OO00O.f31451OooO00o;
                kotlin.jvm.internal.OooOo.OooO0o0(file, "<this>");
                kotlin.jvm.internal.OooOo.OooO0o0(text, "text");
                kotlin.jvm.internal.OooOo.OooO0o0(charset, "charset");
                fileOutputStream = new FileOutputStream(file);
                try {
                    oo000o.OooOOOo(fileOutputStream, text, charset);
                    fileOutputStream.close();
                    return oooOo;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            this.$dest.createNewFile();
            File file2 = this.$dest;
            byte[] array = (byte[]) this.$body;
            kotlin.jvm.internal.OooOo.OooO0o0(file2, "<this>");
            kotlin.jvm.internal.OooOo.OooO0o0(array, "array");
            fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(array);
                fileOutputStream.close();
                return oooOo;
            } finally {
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40102) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidRemoteCacheDataSource(o0000O00 ioDispatcher, CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl, HttpClient httpClient) {
        kotlin.jvm.internal.OooOo.OooO0o0(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(createFile, "createFile");
        kotlin.jvm.internal.OooOo.OooO0o0(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        kotlin.jvm.internal.OooOo.OooO0o0(httpClient, "httpClient");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClient = httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadFile(String str, Integer num, o00O0O0O.OooO0OO oooO0OO) {
        return this.httpClient.execute(new HttpRequest(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, num != null ? num.intValue() : Integer.MAX_VALUE, 65534, null), oooO0OO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveToCache(File file, Object obj, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objOooo00O = o0000OO0.Oooo00O(new C40102(obj, file, null), this.ioDispatcher, oooO0OO);
        return objOooo00O == OooOo00.f31365OooOo0O ? objOooo00O : OooOo.f33195OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getFile(java.io.File r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, o00O0O0O.OooO0OO r17) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource.getFile(java.io.File, java.lang.String, java.lang.String, java.lang.Integer, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
