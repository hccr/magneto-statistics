CREATE TABLE hash_table
(
  hash_index integer not null,
  primary key(hash_index)
);

CREATE TABLE dna (
  id integer AUTO_INCREMENT,
  hash_index integer NOT NULL,
  dna varchar(4096),
  mutant boolean not NULL ,
  PRIMARY KEY (id),
  FOREIGN KEY (hash_index) REFERENCES hash_table(hash_index) ON DELETE CASCADE
);


INSERT INTO hash_table (hash_index)
VALUES
  ('-1604975353'),
  ('-192532850'),
  ('-104301930');


INSERT INTO dna (id,hash_index, dna , mutant)
VALUES
  ('2','-1604975353','ATGCGACAGTGCTTATGTAGAAGGCCCCTATCACTG','1'),
  ('3','-104301930','ATGCGACAGTGCTTATTTAGACGGGCGTCATCACTG','0'),
  ('4','-192532850','AACGTTCGCACAGGTTTTCTGGGGCCCGCTACTTTCTTATTGACCGCGCTAGCTTTGTTGATGATGTATGTTATAGTAAGCGAACCTTTGCAGCGGGACATAGCTAAGCAACGCACGCTTAAGTGTGCAGGCGTTACCAAGGATTACAATAGGTCACTGGCGCCCTCTGTCATAGACACTAAGCCCAGTTTACGTCAGGTTCCTTAAACTATGCCCCGGCCATGTGGGCTCCCGGACACGTAAACCGACCTGTACATTGGCACATCATTCGCTAGGAGTCATCATAGACGCCGGTTCTATAACCTGCACAGAAGAAGAAACACAAGTGTGAAGCGAGCTATACGTGGAGGTTTGGCCACCTGGACATTCACGGGCATTTTTACCTTCGCACGACGATGATGTGTGGACTAATACTCCTGCGTTCACGGCGATCGGTCTTGGCCTCTGAGATGTAGGTCGCCCGACATTTATACCGGAACTTCTTCGGATGAACACACAAGAACATACCCTGATCGTATTGATTCGTTTGCGGAGCTGGGGCTGATCATATATTTAAATGTCTGCATCACTTCGTGAGGCGCCGGTGACCCCCCGTGTCGGTGCGCCGCCAAACATGTACCCCGGTTACGCGCGGGAGGTTTAAGCTCATAAGCCGGTATAGTCTGAAAATTCAAGTACCTGACGCTAATAATAGGCAGACAATATTGTACCACAAAAGTGAGCTCGAGCGATACTTCCAGTCTACGACCCCAAACCTCCGGACGATGGCCAACGACTTTTGCCAAGAACGAGCTGATTCATATCGCATTCTCTGTTTACTCCAGATCATTGTAAAAGGGCATTATGGGCCCCACCAATAATTCACTCATCTGAATGCTACCGGACCTTGTTTGCCTTATTTCAGAGCTAACTTATGTGCAAACAATCAAAACGCGTGCTACCCTCGTGTGAAGGCATAGTAGTATAGTGACTGACGCCACTAGCAGCTAAAGGTACCACGGGGGTTGCGCATTAGTGTACAGTG','1');



