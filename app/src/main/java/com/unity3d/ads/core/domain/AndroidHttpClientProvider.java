package com.unity3d.ads.core.domain;

import OoooOOo.oOO0O00O;
import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.p012di.ServiceProvider;
import java.io.File;
import kotlin.jvm.internal.OooOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0Oo0.oo000o;
import o00O0oOo.o0Oo0oo;
import o00O0oOo.oo0o0Oo;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private final CleanupDirectory cleanupDirectory;
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", m13472f = "AndroidHttpClientProvider.kt", m13473l = {54}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 */
    public static final class C40821 extends OooO0OO {
        int I$0;
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40821(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(null, this);
        }
    }

    public AndroidHttpClientProvider(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        OooOo.OooO0o0(configFileFromLocalStorage, "configFileFromLocalStorage");
        OooOo.OooO0o0(alternativeFlowReader, "alternativeFlowReader");
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(cleanupDirectory, "cleanupDirectory");
        OooOo.OooO0o0(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildCronetCachePath(Context context) {
        File filesDir = context.getFilesDir();
        OooOo.OooO0Oo(filesDir, "context.filesDir");
        File fileOooOOOO = oo000o.OooOOOO(filesDir);
        if (!fileOooOOOO.exists()) {
            fileOooOOOO.mkdirs();
        }
        String absolutePath = fileOooOOOO.getAbsolutePath();
        OooOo.OooO0Oo(absolutePath, "cacheDir.absolutePath");
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, o00O0O0O.OooO0OO oooO0OO) {
        final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        oOO0O00O.OooO00o(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                long maxCachedAssetSizeMb;
                OooOo.OooO0o0(it, "it");
                if (!it.isSuccessful()) {
                    oo0o0oo.resumeWith(new OkHttp3Client(iSDKDispatchers, new o00OOO0.oo000o(), context, this.this$0.sessionRepository, this.this$0.cleanupDirectory, this.this$0.alternativeFlowReader));
                    return;
                }
                if (this.this$0.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
                    long j = 1024;
                    maxCachedAssetSizeMb = this.this$0.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration().getMaxCachedAssetSizeMb() * j * j;
                } else {
                    maxCachedAssetSizeMb = ServiceProvider.HTTP_CACHE_DISK_SIZE;
                }
                try {
                    CronetEngine cronetEngine = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context).setStoragePath(this.this$0.buildCronetCachePath(context)).enableHttpCache(3, maxCachedAssetSizeMb).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443).build();
                    o0Oo0oo o0oo0oo = oo0o0oo;
                    OooOo.OooO0Oo(cronetEngine, "cronetEngine");
                    o0oo0oo.resumeWith(new CronetClient(cronetEngine, iSDKDispatchers));
                } catch (Throwable unused) {
                    oo0o0oo.resumeWith(new OkHttp3Client(iSDKDispatchers, new o00OOO0.oo000o(), context, this.this$0.sessionRepository, this.this$0.cleanupDirectory, this.this$0.alternativeFlowReader));
                }
            }
        });
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Boolean r23, o00O0O0O.OooO0OO r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(java.lang.Boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
