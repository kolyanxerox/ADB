package com.unity3d.ads.core.data.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.io.File;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String objectId, String url, String name, File file, String str, long j, String protocol, int i) {
        OooOo.OooO0o0(objectId, "objectId");
        OooOo.OooO0o0(url, "url");
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(protocol, "protocol");
        this.objectId = objectId;
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cachedFile.objectId;
        }
        if ((i2 & 2) != 0) {
            str2 = cachedFile.url;
        }
        if ((i2 & 4) != 0) {
            str3 = cachedFile.name;
        }
        if ((i2 & 8) != 0) {
            file = cachedFile.file;
        }
        if ((i2 & 16) != 0) {
            str4 = cachedFile.extension;
        }
        if ((i2 & 32) != 0) {
            j = cachedFile.contentLength;
        }
        if ((i2 & 64) != 0) {
            str5 = cachedFile.protocol;
        }
        if ((i2 & 128) != 0) {
            i = cachedFile.priority;
        }
        long j2 = j;
        File file2 = file;
        String str6 = str4;
        String str7 = str3;
        return cachedFile.copy(str, str2, str7, file2, str6, j2, str5, i);
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String objectId, String url, String name, File file, String str, long j, String protocol, int i) {
        OooOo.OooO0o0(objectId, "objectId");
        OooOo.OooO0o0(url, "url");
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(protocol, "protocol");
        return new CachedFile(objectId, url, name, file, str, j, protocol, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return OooOo.OooO00o(this.objectId, cachedFile.objectId) && OooOo.OooO00o(this.url, cachedFile.url) && OooOo.OooO00o(this.name, cachedFile.name) && OooOo.OooO00o(this.file, cachedFile.file) && OooOo.OooO00o(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && OooOo.OooO00o(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(this.objectId.hashCode() * 31, 31, this.url), 31, this.name);
        File file = this.file;
        int iHashCode = (iOooO0O0 + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return Integer.hashCode(this.priority) + OooO00o.OooO0O0((Long.hashCode(this.contentLength) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.protocol);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedFile(objectId=");
        sb.append(this.objectId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", extension=");
        sb.append(this.extension);
        sb.append(", contentLength=");
        sb.append(this.contentLength);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", priority=");
        return OooO0oO.OooOo.OooOOO0(sb, this.priority, ')');
    }

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, OooOO0O oooOO0O) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : file, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? Integer.MAX_VALUE : i);
    }
}
