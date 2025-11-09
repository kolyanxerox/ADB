package org.apache.tika.config;

import OooO0oO.OooOo;
import o0oOO.OooO0o;

/* loaded from: classes3.dex */
public interface LoadErrorHandler {
    public static final LoadErrorHandler IGNORE = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.1
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
        }

        public String toString() {
            return "IGNORE";
        }
    };
    public static final LoadErrorHandler WARN = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.2
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
            OooO0o.OooO0OO(str).OooOO0O(str, "Unable to load {}", th);
        }

        public String toString() {
            return "WARN";
        }
    };
    public static final LoadErrorHandler THROW = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.3
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
            throw new RuntimeException(OooOo.OooOO0("Unable to load ", str), th);
        }

        public String toString() {
            return "THROW";
        }
    };

    void handleLoadError(String str, Throwable th);
}
