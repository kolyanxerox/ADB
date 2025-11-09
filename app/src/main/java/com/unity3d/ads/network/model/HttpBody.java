package com.unity3d.ads.network.model;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public interface HttpBody {

    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] content) {
            OooOo.OooO0o0(content, "content");
            this.content = content;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String content) {
            OooOo.OooO0o0(content, "content");
            this.content = content;
        }

        public final String getContent() {
            return this.content;
        }
    }
}
