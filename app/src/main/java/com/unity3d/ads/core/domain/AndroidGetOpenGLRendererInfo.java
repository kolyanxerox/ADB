package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.p011gl.EglCore;
import com.unity3d.ads.p011gl.OffscreenSurface;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o0OO00O;

/* loaded from: classes3.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public ByteString invoke() {
        if (!this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            ByteString byteStringEmpty = ByteString.empty();
            OooOo.OooO0Oo(byteStringEmpty, "{\n            ByteString.empty()\n        }");
            return byteStringEmpty;
        }
        EglCore eglCore = new EglCore(null, 2);
        OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
        offscreenSurface.makeCurrent();
        String renderer = GLES20.glGetString(7937);
        OooOo.OooO0Oo(renderer, "renderer");
        byte[] bytes = renderer.getBytes(o0OO00O.f31451OooO00o);
        OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        offscreenSurface.release();
        eglCore.release();
        OooOo.OooO0Oo(byteStringCopyFrom, "{\n            // We need…dererByteString\n        }");
        return byteStringCopyFrom;
    }
}
