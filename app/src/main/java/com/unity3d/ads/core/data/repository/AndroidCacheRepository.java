package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import java.io.File;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0Oo0.o00Oo0;
import o00O0Oo0.o00Ooo;
import o00O0Oo0.o0OoOo0;
import o00O0oO.o000000;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00OO0O0;
import o00O0ooo.o0OO;
import oo00o.OooOo;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final File cacheDir;
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final o000OO scope;
    private final SessionRepository sessionRepository;
    private final File webviewCacheDir;

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2", m13472f = "AndroidCacheRepository.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$clearCache$2 */
    public static final class C40342 extends OooOOOO implements o00O0O {
        int label;

        public C40342(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidCacheRepository.this.new C40342(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            boolean zHasCachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration();
            int i = 0;
            OooOo oooOo = OooOo.f33195OooO00o;
            if (!zHasCachedAssetsConfiguration) {
                File[] fileArrListFiles = AndroidCacheRepository.this.cacheDir.listFiles();
                if (fileArrListFiles == null) {
                    return null;
                }
                int length = fileArrListFiles.length;
                while (i < length) {
                    fileArrListFiles[i].delete();
                    i++;
                }
                return oooOo;
            }
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
            AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.cacheDir, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
            if (AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().hasCachedWebviewFilesConfiguration()) {
                NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = AndroidCacheRepository.this.sessionRepository.getNativeConfiguration().getCachedWebviewFilesConfiguration();
                AndroidCacheRepository.this.cleanupDirectory.invoke(AndroidCacheRepository.this.webviewCacheDir, cachedWebviewFilesConfiguration.getMaxCachedAssetSizeMb(), cachedWebviewFilesConfiguration.getMaxCachedAssetAgeMs());
                return oooOo;
            }
            File[] fileArrListFiles2 = AndroidCacheRepository.this.webviewCacheDir.listFiles();
            if (fileArrListFiles2 == null) {
                return null;
            }
            int length2 = fileArrListFiles2.length;
            while (i < length2) {
                fileArrListFiles2[i].delete();
                i++;
            }
            return oooOo;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40342) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository", m13472f = "AndroidCacheRepository.kt", m13473l = {100}, m13474m = "doesFileExist")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 */
    public static final class C40351 extends o00O0OO0.OooO0OO {
        int label;
        /* synthetic */ Object result;

        public C40351(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheRepository.this.doesFileExist(null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2", m13472f = "AndroidCacheRepository.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2 */
    public static final class C40362 extends OooOOOO implements o00O0O {
        int label;

        /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getCacheSize$2$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.OooOo00 implements Oooo000 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1, File.class, "isFile", "isFile()Z", 0);
            }

            @Override // o00O0Oo.Oooo000
            public final Boolean invoke(File p0) {
                kotlin.jvm.internal.OooOo.OooO0o0(p0, "p0");
                return Boolean.valueOf(p0.isFile());
            }
        }

        public C40362(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidCacheRepository.this.new C40362(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            File file = AndroidCacheRepository.this.cacheDir;
            o00Ooo o00ooo2 = o00Ooo.f31394OooOo0O;
            kotlin.jvm.internal.OooOo.OooO0o0(file, "<this>");
            o0OoOo0 o0oooo0 = new o0OoOo0(o00O0o.o0OoOo0.Oooo0O0(new o00Oo0(file, o00ooo2), AnonymousClass1.INSTANCE));
            long length = 0;
            while (o0oooo0.hasNext()) {
                length += ((File) o0oooo0.next()).length();
            }
            return new Long(length);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40362) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2", m13472f = "AndroidCacheRepository.kt", m13473l = {70, 77, 89}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2 */
    public static final class C40372 extends OooOOOO implements o00O0O {
        final /* synthetic */ File $cacheDirectory;
        final /* synthetic */ int $priority;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1", m13472f = "AndroidCacheRepository.kt", m13473l = {79, 85}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements Oooo000 {
            final /* synthetic */ File $cacheDirectory;
            final /* synthetic */ o0OO $fileResult;
            final /* synthetic */ String $filename;
            final /* synthetic */ int $priority;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ AndroidCacheRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidCacheRepository androidCacheRepository, File file, String str, String str2, int i, o0OO o0oo, OooO0OO oooO0OO) {
                super(1, oooO0OO);
                this.this$0 = androidCacheRepository;
                this.$cacheDirectory = file;
                this.$filename = str;
                this.$url = str2;
                this.$priority = i;
                this.$fileResult = o0oo;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(OooO0OO oooO0OO) {
                return new AnonymousClass1(this.this$0, this.$cacheDirectory, this.$filename, this.$url, this.$priority, this.$fileResult, oooO0OO);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
            
                if (r12 == r0) goto L21;
             */
            @Override // o00O0OO0.OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                    int r1 = r11.label
                    oo00o.OooOo r2 = oo00o.OooOo.f33195OooO00o
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r4) goto L1b
                    if (r1 != r3) goto L13
                    o00O0.o000OOo.OooOO0O(r12)
                    r9 = r11
                    goto L76
                L13:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1b:
                    o00O0.o000OOo.OooOO0O(r12)
                    r9 = r11
                    goto L41
                L20:
                    o00O0.o000OOo.OooOO0O(r12)
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r11.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r5 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r12)
                    java.io.File r6 = r11.$cacheDirectory
                    java.lang.String r7 = r11.$filename
                    java.lang.String r8 = r11.$url
                    int r12 = r11.$priority
                    java.lang.Integer r9 = new java.lang.Integer
                    r9.<init>(r12)
                    r11.label = r4
                    r10 = r11
                    java.lang.Object r12 = r5.getFile(r6, r7, r8, r9, r10)
                    r9 = r10
                    if (r12 != r0) goto L41
                    goto L75
                L41:
                    com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
                    boolean r1 = r12 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                    if (r1 == 0) goto L5a
                    o00O0ooo.o0OO r1 = r9.$fileResult
                L49:
                    r0 = r1
                    o00O0ooo.oO00000o r0 = (o00O0ooo.oO00000o) r0
                    java.lang.Object r3 = r0.getValue()
                    r4 = r3
                    com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                    boolean r0 = r0.OooO0oO(r3, r12)
                    if (r0 == 0) goto L49
                    return r2
                L5a:
                    com.unity3d.ads.core.data.repository.AndroidCacheRepository r12 = r9.this$0
                    com.unity3d.ads.core.data.datasource.CacheDataSource r4 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getRemoteCacheDataSource$p(r12)
                    java.io.File r5 = r9.$cacheDirectory
                    java.lang.String r6 = r9.$filename
                    java.lang.String r7 = r9.$url
                    int r12 = r9.$priority
                    java.lang.Integer r8 = new java.lang.Integer
                    r8.<init>(r12)
                    r9.label = r3
                    java.lang.Object r12 = r4.getFile(r5, r6, r7, r8, r9)
                    if (r12 != r0) goto L76
                L75:
                    return r0
                L76:
                    com.unity3d.ads.core.data.model.CacheResult r12 = (com.unity3d.ads.core.data.model.CacheResult) r12
                    o00O0ooo.o0OO r0 = r9.$fileResult
                L7a:
                    r1 = r0
                    o00O0ooo.oO00000o r1 = (o00O0ooo.oO00000o) r1
                    java.lang.Object r3 = r1.getValue()
                    r4 = r3
                    com.unity3d.ads.core.data.model.CacheResult r4 = (com.unity3d.ads.core.data.model.CacheResult) r4
                    boolean r1 = r1.OooO0oO(r3, r12)
                    if (r1 == 0) goto L7a
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C40372.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // o00O0Oo.Oooo000
            public final Object invoke(OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40372(String str, File file, int i, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$url = str;
            this.$cacheDirectory = file;
            this.$priority = i;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidCacheRepository.this.new C40372(this.$url, this.$cacheDirectory, this.$priority, oooO0OO);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[RETURN] */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r5 = r18
                o00O0O0o.OooOo00 r6 = o00O0O0o.OooOo00.f31365OooOo0O
                int r0 = r5.label
                r7 = 0
                r8 = 3
                r9 = 2
                r1 = 1
                if (r0 == 0) goto L31
                if (r0 == r1) goto L26
                if (r0 == r9) goto L1e
                if (r0 != r8) goto L16
                o00O0.o000OOo.OooOO0O(r19)
                return r19
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r5.L$0
                o00O0ooo.o0OO r0 = (o00O0ooo.o0OO) r0
                o00O0.o000OOo.OooOO0O(r19)
                goto L8a
            L26:
                java.lang.Object r0 = r5.L$0
                java.lang.String r0 = (java.lang.String) r0
                o00O0.o000OOo.OooOO0O(r19)
                r13 = r0
                r0 = r19
                goto L5c
            L31:
                o00O0.o000OOo.OooOO0O(r19)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.lang.String r2 = r5.$url
                java.lang.String r2 = r0.getFilename(r2)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.data.datasource.CacheDataSource r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getLocalCacheDataSource$p(r0)
                java.io.File r3 = r5.$cacheDirectory
                r4 = r3
                java.lang.String r3 = r5.$url
                int r10 = r5.$priority
                r11 = r4
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r10)
                r5.L$0 = r2
                r5.label = r1
                r1 = r11
                java.lang.Object r0 = r0.getFile(r1, r2, r3, r4, r5)
                if (r0 != r6) goto L5b
                goto L9a
            L5b:
                r13 = r2
            L5c:
                com.unity3d.ads.core.data.model.CacheResult r0 = (com.unity3d.ads.core.data.model.CacheResult) r0
                boolean r1 = r0 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r1 == 0) goto L63
                return r0
            L63:
                o00O0ooo.oO00000o r16 = o00O0ooo.o0o0000.OooO0OO(r7)
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                com.unity3d.ads.core.domain.work.DownloadPriorityQueue r0 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.access$getDownloadPriorityQueue$p(r0)
                int r15 = r5.$priority
                com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1 r10 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$getFileInternal$2$1
                com.unity3d.ads.core.data.repository.AndroidCacheRepository r11 = com.unity3d.ads.core.data.repository.AndroidCacheRepository.this
                java.io.File r12 = r5.$cacheDirectory
                java.lang.String r14 = r5.$url
                r17 = 0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                r1 = r16
                r5.L$0 = r1
                r5.label = r9
                java.lang.Object r0 = r0.invoke(r15, r10, r5)
                if (r0 != r6) goto L89
                goto L9a
            L89:
                r0 = r1
            L8a:
                o00O.o0OoOo0 r1 = new o00O.o0OoOo0
                r2 = 3
                r1.<init>(r0, r2)
                r5.L$0 = r7
                r5.label = r8
                java.lang.Object r0 = o00O0ooo.o0o0000.OooOO0o(r1, r5)
                if (r0 != r6) goto L9b
            L9a:
                return r6
            L9b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.C40372.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40372) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidCacheRepository(o0000O00 ioDispatcher, GetCacheDirectory getCacheDirectory, CacheDataSource localCacheDataSource, CacheDataSource remoteCacheDataSource, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile) {
        kotlin.jvm.internal.OooOo.OooO0o0(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(getCacheDirectory, "getCacheDirectory");
        kotlin.jvm.internal.OooOo.OooO0o0(localCacheDataSource, "localCacheDataSource");
        kotlin.jvm.internal.OooOo.OooO0o0(remoteCacheDataSource, "remoteCacheDataSource");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(cleanupDirectory, "cleanupDirectory");
        kotlin.jvm.internal.OooOo.OooO0o0(downloadPriorityQueue, "downloadPriorityQueue");
        kotlin.jvm.internal.OooOo.OooO0o0(createFile, "createFile");
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = localCacheDataSource;
        this.remoteCacheDataSource = remoteCacheDataSource;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.scope = o0000OO0.OooOo0o(o0000OO0.OooOo0o(o0000OO0.OooO0O0(ioDispatcher), new o0000O0O("CacheRepository")), o00OO0O0.f31546OooOo0O);
        this.cacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
        this.webviewCacheDir = initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40372(str, file, i, null), this.scope.getCoroutineContext(), oooO0OO);
    }

    private final File initCacheDir(String str) {
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        File cacheDir = this.context.getCacheDir();
        kotlin.jvm.internal.OooOo.OooO0Oo(cacheDir, "context.cacheDir");
        File fileInvoke = getCacheDirectory.invoke(cacheDir, str);
        fileInvoke.mkdirs();
        return fileInvoke;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40342(null), this.scope.getCoroutineContext(), oooO0OO);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doesFileExist(java.lang.String r5, o00O0O0O.OooO0OO r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidCacheRepository.C40351
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = (com.unity3d.ads.core.data.repository.AndroidCacheRepository.C40351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1 r0 = new com.unity3d.ads.core.data.repository.AndroidCacheRepository$doesFileExist$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            o00O0.o000OOo.OooOO0O(r6)
            r0.label = r3
            java.lang.Object r6 = r4.retrieveFile(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            boolean r5 = r6 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidCacheRepository.doesFileExist(java.lang.String, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40362(null), this.scope.getCoroutineContext(), oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i, OooO0OO oooO0OO) {
        return getFileInternal(this.cacheDir, str, jSONArray, i, oooO0OO);
    }

    public final String getFilename(String url) {
        kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
        return StringExtensionsKt.getSHA256Hash(url) + '.' + o000000.OooooOo('.', url, url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, OooO0OO oooO0OO) {
        File fileInvoke = this.createFile.invoke(this.webviewCacheDir, str2);
        fileInvoke.mkdirs();
        return getFileInternal(fileInvoke, str, null, 0, oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        kotlin.jvm.internal.OooOo.OooO0o0(cachedFile, "cachedFile");
        File file = cachedFile.getFile();
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, OooO0OO oooO0OO) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.cacheDir, str, null, null, oooO0OO, 12, null);
    }
}
