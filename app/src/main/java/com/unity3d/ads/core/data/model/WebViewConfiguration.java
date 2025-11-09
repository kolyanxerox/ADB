package com.unity3d.ads.core.data.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final String type;
    private final int version;

    public WebViewConfiguration(int i, String entryPoint, List<String> additionalFiles, String type) {
        OooOo.OooO0o0(entryPoint, "entryPoint");
        OooOo.OooO0o0(additionalFiles, "additionalFiles");
        OooOo.OooO0o0(type, "type");
        this.version = i;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i, String str, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        if ((i2 & 8) != 0) {
            str2 = webViewConfiguration.type;
        }
        return webViewConfiguration.copy(i, str, list, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final String component4() {
        return this.type;
    }

    public final WebViewConfiguration copy(int i, String entryPoint, List<String> additionalFiles, String type) {
        OooOo.OooO0o0(entryPoint, "entryPoint");
        OooOo.OooO0o0(additionalFiles, "additionalFiles");
        OooOo.OooO0o0(type, "type");
        return new WebViewConfiguration(i, entryPoint, additionalFiles, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && OooOo.OooO00o(this.entryPoint, webViewConfiguration.entryPoint) && OooOo.OooO00o(this.additionalFiles, webViewConfiguration.additionalFiles) && OooOo.OooO00o(this.type, webViewConfiguration.type);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.additionalFiles.hashCode() + OooO00o.OooO0O0(Integer.hashCode(this.version) * 31, 31, this.entryPoint)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebViewConfiguration(version=");
        sb.append(this.version);
        sb.append(", entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", additionalFiles=");
        sb.append(this.additionalFiles);
        sb.append(", type=");
        return OooO00o.OooO0oO(')', this.type, sb);
    }
}
