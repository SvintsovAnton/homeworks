package de.ait.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@EqualsAndHashCode
@Slf4j
@Getter

public class StudentLombok {
    private String firstName;
    private String secondName;

    public void getInfo() {
        log.info("Student {}", firstName);
    }
}
