package org.apache.tika.utils;

/* loaded from: classes3.dex */
public class FileProcessResult {
    String stderr = "";
    String stdout = "";
    int exitValue = -1;
    long processTimeMillis = -1;
    boolean isTimeout = false;
    long stdoutLength = -1;
    long stderrLength = -1;
    boolean stderrTruncated = false;
    boolean stdoutTruncated = false;

    public int getExitValue() {
        return this.exitValue;
    }

    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    public String getStderr() {
        return this.stderr;
    }

    public long getStderrLength() {
        return this.stderrLength;
    }

    public String getStdout() {
        return this.stdout;
    }

    public long getStdoutLength() {
        return this.stdoutLength;
    }

    public boolean isStderrTruncated() {
        return this.stderrTruncated;
    }

    public boolean isStdoutTruncated() {
        return this.stdoutTruncated;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setExitValue(int i) {
        this.exitValue = i;
    }

    public void setProcessTimeMillis(long j) {
        this.processTimeMillis = j;
    }

    public void setStderr(String str) {
        this.stderr = str;
    }

    public void setStderrLength(long j) {
        this.stderrLength = j;
    }

    public void setStderrTruncated(boolean z) {
        this.stderrTruncated = z;
    }

    public void setStdout(String str) {
        this.stdout = str;
    }

    public void setStdoutLength(long j) {
        this.stdoutLength = j;
    }

    public void setStdoutTruncated(boolean z) {
        this.stdoutTruncated = z;
    }

    public void setTimeout(boolean z) {
        this.isTimeout = z;
    }

    public String toString() {
        String str = this.stderr;
        String str2 = this.stdout;
        int i = this.exitValue;
        long j = this.processTimeMillis;
        boolean z = this.isTimeout;
        long j2 = this.stdoutLength;
        long j3 = this.stderrLength;
        boolean z2 = this.stderrTruncated;
        boolean z3 = this.stdoutTruncated;
        StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("FileProcessResult{stderr='", str, "', stdout='", str2, "', exitValue=");
        sbOooOOo0.append(i);
        sbOooOOo0.append(", processTimeMillis=");
        sbOooOOo0.append(j);
        sbOooOOo0.append(", isTimeout=");
        sbOooOOo0.append(z);
        sbOooOOo0.append(", stdoutLength=");
        sbOooOOo0.append(j2);
        sbOooOOo0.append(", stderrLength=");
        sbOooOOo0.append(j3);
        sbOooOOo0.append(", stderrTruncated=");
        sbOooOOo0.append(z2);
        sbOooOOo0.append(", stdoutTruncated=");
        sbOooOOo0.append(z3);
        sbOooOOo0.append("}");
        return sbOooOOo0.toString();
    }
}
