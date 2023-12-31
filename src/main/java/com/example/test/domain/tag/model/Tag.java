package com.example.test.domain.tag.model;

import javax.persistence.*;

import com.example.test.domain.board.model.BoardDef;
import lombok.*;

@Entity
@Table(name = "TAG")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TAG_NO")
    private Long tagNo; // 태그 id

    @Column(name = "TAG")
    private String tag; // 태그

    @ManyToOne
    @JoinColumn(name = "BOARD_CD")
    private BoardDef boardCd; // 게시판 분류코드
}
