package org.ibm.dp;

import lombok.Data;

@Data
class DatapowerCredentials {
    String host;
    int port;
    String username;
    String password;
}
